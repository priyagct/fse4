package com.poc.fse.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillSetRepository extends JpaRepository<SkillSetDetails, String> {
    SkillSetDetails findByAssociateId(String associateId);
}
