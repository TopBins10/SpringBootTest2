package com.springboottest2.springboottest2;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    public void getProfileInfo(ProfileInfo profile) {
        System.out.println("Here is the recieved profile: " + profile);
    }
}