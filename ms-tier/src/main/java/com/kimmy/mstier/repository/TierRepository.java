package com.kimmy.mstier.repository;

import com.kimmy.mstier.entity.Tier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierRepository extends JpaRepository<Tier ,Integer> {
}
