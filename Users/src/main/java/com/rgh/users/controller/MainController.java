package com.rgh.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rgh.users.DBContextHolder;
import com.rgh.users.DBTypeEnum;
import com.rgh.users.entity.user;
import com.rgh.users.repository.UserRepository;

@RestController
public class MainController {
	
	@Autowired
    private UserRepository uesrRepository;
	
	@GetMapping("/getAll")
    @ResponseBody
    public Iterable<user> getTest(@RequestParam(defaultValue = "schema1") String client) {
        switch (client) {
            case "schema1":
                DBContextHolder.setCurrentDb(DBTypeEnum.SCHEMA_1);
                break;
            case "schema2":
                DBContextHolder.setCurrentDb(DBTypeEnum.SCHEMA_2);
                break;
        }
        return uesrRepository.findAll();
    }
	

	@PostMapping("/add")
    @ResponseBody
    public user addUser(@RequestParam(defaultValue = "schema1") String client,
    		@RequestParam Integer id,
    		@RequestParam String firstName, @RequestParam String lastName) {
        switch (client) {
            case "schema1":
                DBContextHolder.setCurrentDb(DBTypeEnum.SCHEMA_1);
                break;
            case "schema2":
                DBContextHolder.setCurrentDb(DBTypeEnum.SCHEMA_2);
                break;
        }
        
        user inputUser = new user(id,firstName,lastName);
        
        return uesrRepository.save(inputUser);
    }
	

}
