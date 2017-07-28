package com.example;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.example.Color;


public class ColorValidator implements Validator  {
public boolean supports(Class<?>paramClass){
	
	return Color.class.equals(paramClass);
	
}
public void validate(Object obj, Errors errors){
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "colorName","valid.color");
}
}
