package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Images;
import com.bezkoder.springjwt.repository.ImagesRepository;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImagesRepository imageRepository;

    @Override
    public List<Images> getListImage() {
        return imageRepository.findAll();
    }

    @Override
    public Images getImageById(long id) {
        Images image = imageRepository.findById(id).orElseThrow();

        return image;
    }

    @Override
    public Images save(Images image) {
        return imageRepository.save(image);
    }

    @Override
    public void deleteImage(long id) {
        return;
        
    }

    @Override
    public List<Images> getListByUser(long userId) {
        throw new UnsupportedOperationException("Unimplemented method 'getListByUser'");
    }
}
