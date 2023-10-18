package com.bezkoder.springjwt.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.springjwt.models.HangThuySan;
import com.bezkoder.springjwt.repository.HangTSRepository;


import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/hangts")
@PreAuthorize("hasRole('ADMIN')")
public class HangTSController {

    @Autowired
    private HangTSRepository hangtsRepository;

    @GetMapping
    
    public List<HangThuySan> getAllHangTSs() {
        return hangtsRepository.findAll();
    }

    @GetMapping("/{id}")
    public HangThuySan getCustomerById(@PathVariable("id") int id) {
        return hangtsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public HangThuySan createHangts(@RequestBody HangThuySan hangts) {
        return hangtsRepository.save(hangts);
    }

    @PutMapping("/{id}")
    public HangThuySan updateHangts(@PathVariable("id") int id, @RequestBody HangThuySan hangtsDetails) {
        HangThuySan hangts = hangtsRepository.findById(id).orElse(null);
        if (hangts != null) {
            hangts.setTenLoai(hangtsDetails.getTenLoai());
            hangts.setCreateUsername(hangtsDetails.getCreateUsername());
            hangts.setCoords(hangtsDetails.getCoords());
            hangts.setIsActive(hangtsDetails.getIsActive());
            hangts.setIsDelete(hangtsDetails.getIsDelete());
            hangts.setIdNV(hangtsDetails.getIdNV());
            return hangtsRepository.save(hangts);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id) {
        hangtsRepository.deleteById(id);
    }
}
