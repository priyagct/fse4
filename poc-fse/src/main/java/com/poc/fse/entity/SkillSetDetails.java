package com.poc.fse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SkillSetDetails")
public class SkillSetDetails {
    @Column(name="name")
    private String name;

    @Id
    @Column(name="associate_id")
    private String associateId;

    @Column(name="skill_set")
    private String skillSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public SkillSetDetails(String name, String associateId, String skillSet) {
        this.name = name;
        this.associateId = associateId;
        this.skillSet = skillSet;
    }

    public SkillSetDetails() {
    }
}
