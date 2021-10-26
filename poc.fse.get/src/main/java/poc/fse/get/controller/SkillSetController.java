package poc.fse.get.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import poc.fse.get.bean.SkillSetDetailsBean;
import poc.fse.get.client.SkillSetDetailClient;

import javax.ws.rs.GET;

@RestController
public class SkillSetController {

    @Autowired
    SkillSetDetailClient client;

    @GetMapping("/getSkillDetails/{associateId}")
    public SkillSetDetailsBean getSkillDetails(@PathVariable String associateId){

        SkillSetDetailsBean skillSetDetailsBean = client.getSkillDetails(associateId);
        return skillSetDetailsBean;
    }

}
