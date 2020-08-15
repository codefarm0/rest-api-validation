package com.gl.userManagementApp.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class AddressObjectValidator implements ConstraintValidator<AddressObjectValidation, List<Address>> {

    List<String> addresses = Arrays.asList("Noida","Delhi");
    @Override
    public boolean isValid(List<Address> addresses, ConstraintValidatorContext context) {
        return addresses.size() > 2;
    }
}
