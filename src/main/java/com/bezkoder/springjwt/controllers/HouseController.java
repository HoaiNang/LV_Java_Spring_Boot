package com.bezkoder.springjwt.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.springjwt.models.House;
import com.bezkoder.springjwt.repository.HouseRepository;


import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/house")

public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    @GetMapping
    
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable("id") int id) {
        return houseRepository.findById(id).orElse(null);
    }

    @PostMapping
    public House createHouse(@RequestBody House house) {
        return houseRepository.save(house);
    }

    @PutMapping("/{id}")
    public House updateHouse(@PathVariable("id") int id, @RequestBody House houseDetails) {
        House house = houseRepository.findById(id).orElse(null);
        if (house != null) {
            house.setTitle(houseDetails.getTitle());
            house.setDesc(houseDetails.getDesc());
            house.setAddr(houseDetails.getAddr());
            house.setPhone(houseDetails.getPhone());
            house.setRent_price(houseDetails.getRent_price());
            house.setNroom(houseDetails.getNroom());
            house.setNbroom(houseDetails.getNbroom());
            house.setUser_id(houseDetails.getUser_id());
            return houseRepository.save(house);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteHouse(@PathVariable("id") int id) {
        houseRepository.deleteById(id);
    }
}
