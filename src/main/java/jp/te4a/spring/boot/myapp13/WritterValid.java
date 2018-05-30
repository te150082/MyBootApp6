package jp.te4a.spring.boot.myapp13;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Constraint(validatedBy = WritterValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WritterValid {

	String ok();
    String message() default "input {ok}.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};

}
