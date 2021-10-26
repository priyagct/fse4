package com.poc.fse.controller;

import com.poc.fse.bean.SkillSetDetailsBean;
import com.poc.fse.entity.SkillSetDetails;
import com.poc.fse.entity.SkillSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.env.Environment;


@RestController
public class SkillSetController {

    @Autowired
    Environment environment;
    @Autowired
    SkillSetRepository skillSetRepository;

    @GetMapping("/getSkillDetails/{associateId}")
    public SkillSetDetailsBean getSkillDetails(@PathVariable String associateId)
    {
        SkillSetDetails skillSetEntity = skillSetRepository.findByAssociateId(associateId);
        SkillSetDetailsBean skillSetBean = new SkillSetDetailsBean(skillSetEntity.getName(),skillSetEntity.getAssociateId()
                ,skillSetEntity.getSkillSet(),
                Integer.parseInt(environment.getProperty("local.server.port")));
        return skillSetBean;
    }

    @PostMapping("/addSkill")
    public SkillSetDetailsBean createTutorial(@RequestBody SkillSetDetailsBean skillSet) {
        SkillSetDetails skillSetEntity = skillSetRepository
                .save(new SkillSetDetails(skillSet.getName(), skillSet.getAssociateId(),skillSet.getSkillSet()));
        System.out.println(skillSetEntity.toString());
        return new SkillSetDetailsBean(skillSetEntity.getName(),skillSetEntity.getAssociateId(),skillSetEntity.getSkillSet());
    }


}
