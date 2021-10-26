package poc.fse.get.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import poc.fse.get.bean.SkillSetDetailsBean;

//@FeignClient(name="poc-fse-add", url="localhost:8800")
@FeignClient(name="poc-fse-add")
public interface SkillSetDetailClient {

    @GetMapping("/getSkillDetails/{associateId}")
    public SkillSetDetailsBean getSkillDetails(@PathVariable String associateId);
}
