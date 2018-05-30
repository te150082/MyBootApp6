package jp.te4a.spring.boot.myapp13;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<WritterValid,String>{
	String param;
	@Override
	public void initialize(WritterValid nv){ param =  nv.ok(); }
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(param));
		return in.equals(param);
}}