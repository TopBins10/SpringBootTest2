package com.springboottest2.springboottest2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class Controller {

    @GetMapping("/api/string/{resourceId}")
    public String getString(@PathVariable String resourceId) {
        return "Hello, your resource id is " + resourceId;

    }

    @PostMapping("/api/getprofile")
    public void getprofile(@RequestBody Profile profile) {
        System.out.println("Here is the recieved profile: " + profile);
    }
    

}


class Profile {
    
    private String name;
    private String email;

    public Profile() {

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }

}