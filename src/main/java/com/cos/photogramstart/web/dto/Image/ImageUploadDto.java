package com.cos.photogramstart.web.dto.Image;

import org.springframework.web.multipart.MultipartFile;

import com.cos.photogramstart.domain.image.Image;
import com.cos.photogramstart.domain.user.User;

import lombok.Data;


@Data
public class ImageUploadDto {
	private MultipartFile file;
	private String caption;
	//private String tags;

	public Image toEntity(String postImageUrl, User user) {
		return Image.builder()
				.caption(caption)
				.postImageUrl(postImageUrl)
				.user(user)
				.build();
	}
	
}
