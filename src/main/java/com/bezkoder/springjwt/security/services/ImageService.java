package com.bezkoder.springjwt.security.services;

import java.util.List;

import com.bezkoder.springjwt.models.Images;

public interface ImageService {
    List<Images> getListImage();

    Images getImageById(long id);

    Images save(Images image);

    List<Images> getListByUser(long userId);

    void deleteImage(long id);
}
