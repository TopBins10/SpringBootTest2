package com.springboottest2.springboottest2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.config.Profiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class Controller {

    private ProfileService profileService;

    public Controller(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/api/string/{resourceId}")
    public String getString(@PathVariable String resourceId) {
        return "Hello, your resource id is " + resourceId;
    }

    @PostMapping("/api/getprofileinfo")
    public void getprofile(@RequestBody ProfileInfo profile) {
        profileService.getProfileInfo(profile);
    }
    


}