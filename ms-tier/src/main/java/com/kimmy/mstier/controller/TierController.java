package com.kimmy.mstier.controller;

import com.kimmy.mstier.entity.Tier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kimmy.mstier.service.TierService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/tiers")
public class TierController {

    @Autowired
    private TierService tierService;

    @GetMapping("/{id}")
    public Tier getTier(@PathVariable int id){
        return tierService.getTier(id);
    }

    @GetMapping("/all")
    public List<Tier> getTiers(){
        return tierService.getTiers();
    }

    @PostMapping("/add")
    public Tier addTier(@RequestBody Tier tier){
        log.info("currently excecuting  addtier controller");
        return tierService.addTier(tier);
    }
}
