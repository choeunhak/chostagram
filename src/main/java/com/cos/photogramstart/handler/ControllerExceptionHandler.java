package com.cos.photogramstart.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.photogramstart.handler.ex.CustomValidationException;

@RestController
@ControllerAdvice//에러처리 낚아채게 handler 등록
public class ControllerExceptionHandler {

	@ExceptionHandler(CustomValidationException.class)//모든 runtime익셉션 낚아챔
	public Map<String, String> validationException(CustomValidationException e) {
		return e.getErrorMap();
		
	}
}