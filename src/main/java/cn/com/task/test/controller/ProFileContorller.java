package cn.com.ocj.test.controller;

import cn.com.ocj.test.service.ProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProFileContorller {

    @Resource
    private ProfileService profileService;

    @RequestMapping("/profile")
    public  String profile(){
     String str =  profileService.getProfileDomain();
        return str;
    }
}
