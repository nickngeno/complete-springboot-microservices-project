package com.kimmy.mspackage.repository;

import com.kimmy.mspackage.entity.InternetPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternetPackageRepository extends JpaRepository<InternetPackage, Integer> {
}
