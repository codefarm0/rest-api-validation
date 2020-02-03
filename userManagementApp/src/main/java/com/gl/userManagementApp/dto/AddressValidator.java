package com.gl.userManagementApp.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class AddressValidator implements ConstraintValidator<AddressValidation, String> {

    List<String> addresses = Arrays.asList("Noida","Delhi");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return addresses.contains(value);
    }
}
