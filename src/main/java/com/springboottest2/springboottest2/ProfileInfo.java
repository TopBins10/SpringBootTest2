package com.springboottest2.springboottest2;

public class ProfileInfo {
    
        private String name;
        private String email;
    
        public ProfileInfo() {
    
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
