package com.kimmy.mstier.service;

import com.kimmy.mstier.entity.Tier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kimmy.mstier.repository.TierRepository;

import java.util.List;

@Slf4j
@Service
public class TierService {

    @Autowired
    private  TierRepository tierRepository;

    public Tier addTier(Tier tier) {
        log.info("currently in addtier service method");
        return tierRepository.save(tier);
    }

    public Tier getTier(int id) {
        return tierRepository.findById(id).orElseThrow();
    }

    public List<Tier> getTiers() {
        return tierRepository.findAll();
    }
}
