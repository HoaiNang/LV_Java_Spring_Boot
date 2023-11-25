package com.bezkoder.springjwt.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.springjwt.models.Contacts;
import com.bezkoder.springjwt.repository.ContactRepository;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    
    public List<Contacts> getAllContacts() {
        return contactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contacts getContactsById(@PathVariable("id") int id) {
        return contactRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Contacts createContacts(@RequestBody Contacts contacts) {
        return contactRepository.save(contacts);
    }

    @PutMapping("/{id}")
    public Contacts updateContacts(@PathVariable("id") int id, @RequestBody Contacts contactsDetails) {
        Contacts contacts = contactRepository.findById(id).orElse(null);
        if (contacts != null) {
            contacts.setUser_id(contactsDetails.getUser_id());
            contacts.setFullname(contactsDetails.getFullname());
            contacts.setEmail(contactsDetails.getEmail());
            contacts.setDes(contactsDetails.getDes());
            return contactRepository.save(contacts);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteContacts(@PathVariable("id") int id) {
        contactRepository.deleteById(id);
    }
}
