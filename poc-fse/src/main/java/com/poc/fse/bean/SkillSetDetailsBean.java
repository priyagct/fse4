package com.poc.fse.bean;

public class SkillSetDetailsBean {
    private String name;
    private String associateId;
    private String skillSet;

    private Integer port;

    public SkillSetDetailsBean() {
    }

    public SkillSetDetailsBean(String name, String associateId, String skillSet) {
        this.name = name;
        this.associateId = associateId;
        this.skillSet = skillSet;
    }

    public SkillSetDetailsBean(String name, String associateId, String skillSet, Integer port) {
        this.name = name;
        this.associateId = associateId;
        this.skillSet = skillSet;
        this.port = port;
    }

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

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "SkillSetDetailsBean{" +
                "name='" + name + '\'' +
                ", associateId='" + associateId + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", port=" + port +
                '}';
    }
}
