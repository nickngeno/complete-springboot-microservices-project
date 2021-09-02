package com.kimmy.mspackage.service;


import com.kimmy.mspackage.VO.ResponseTemplateVO;
import com.kimmy.mspackage.VO.Tier;
import com.kimmy.mspackage.entity.InternetPackage;
import com.kimmy.mspackage.repository.InternetPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class InternetPackageService {

    @Autowired
    private InternetPackageRepository internetPackageRepository;

    @Autowired
    private RestTemplate restTemplate;

    public InternetPackage addPackage(InternetPackage internetPackage) {
        return internetPackageRepository.save(internetPackage);
    }

    public List<InternetPackage> getPackages() {
        return internetPackageRepository.findAll();
    }


    public ResponseTemplateVO getPackageWithTier(int id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();

        InternetPackage internetPackage = internetPackageRepository.findById(id).orElseThrow();

        Tier tier =
                restTemplate.getForObject("http://TIER-SERVICE/api/tiers/" + internetPackage.getTierId()
                        , Tier.class);
        vo.setInternetPackage(internetPackage);
        vo.setTier(tier);

        return vo;
    }
}
