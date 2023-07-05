package com.jiamo.seckill.validator;

import com.jiamo.seckill.util.ValidatorUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile,String> {

    //是否进行校验
    private boolean required = false;

    @Override
    public void initialize(IsMobile isMobile) {
        required = isMobile.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if(required) {
            return ValidatorUtil.isMobile(s);
        }else {
            if(StringUtils.isEmpty(s)) {
                return true;
            }else {
                return ValidatorUtil.isMobile(s);
            }
        }
    }
}
