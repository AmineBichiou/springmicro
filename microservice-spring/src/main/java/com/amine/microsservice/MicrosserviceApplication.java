package com.amine.microsservice;

import com.amine.microsservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class MicrosserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrosserviceApplication.class, args);
    }
    @Autowired
    UserService userService;
   /* @PostConstruct
    void init_users() {



//ajouter les rôles
        userService.addRole(new Role(null,"ADMIN"));
        userService.addRole(new Role(null,"USER"));

//ajouter les utilisateurs roles

        userService.addRoleToUser(1L,new Role(null,"ADMIN"));



    }*/
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }

}
