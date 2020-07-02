package com.uploadFile.image.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    ImageRepository repository;

    public List<Image> getAll(){
        return repository.findAll();
    }

    public Image getById(Long id){
        return repository.findById(id).get();
    }

    public Image saveImage(Image image){
        return repository.save(image);
    }

    public void deleteImage(Long id){
        repository.deleteById(id);
    }
}
