package com.example.jpamanytoone.controller;

import com.example.jpamanytoone.model.Region;
import com.example.jpamanytoone.service.ApiServiceGetRegioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionRestController {

    @Autowired
    ApiServiceGetRegioner apiServiceGetRegioner;

    @GetMapping("/getregioner")
    public List<Region> getRegioner(){
        List<Region> lstRegioner = apiServiceGetRegioner.getRegion();
        return lstRegioner;
    }
}
