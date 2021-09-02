package com.kimmy.mspackage.controller;

import com.kimmy.mspackage.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kimmy.mspackage.service.InternetPackageService;
import com.kimmy.mspackage.entity.InternetPackage;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class InternetPackageController {

    @Autowired
    private InternetPackageService internetPackageService;

    @GetMapping("/all")
    public List<InternetPackage> getpackages() {
        return internetPackageService.getPackages();
    }

    @PostMapping("/addpackage")
    public InternetPackage addPackage(@RequestBody InternetPackage internetPackage) {
        return internetPackageService.addPackage(internetPackage);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getPackageWithTier(@PathVariable int id) {
        return internetPackageService.getPackageWithTier(id);
    }


}
