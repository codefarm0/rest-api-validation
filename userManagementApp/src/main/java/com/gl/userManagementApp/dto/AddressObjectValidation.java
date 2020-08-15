package com.gl.userManagementApp.dto;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AddressObjectValidator.class)
public @interface AddressObjectValidation {
    String message() default "This is not the valid address object";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
