package com.se.dream_shop.service.image;

import com.se.dream_shop.dto.ImageDto;
import com.se.dream_shop.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(Long productId, List<MultipartFile> file);

    void updateImage(MultipartFile file, Long imageId);
}
