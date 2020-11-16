import com.qingan.bean.TesteBean;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Set;

public class TestMain {

//      普通模式
//    public static void main(String[] args){
//
//        //      通过Validation创建一个Validator实例
//        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//        //      创建一个不符合的实例
//        TesteBean tb = new TesteBean("aaa","");
//
//        //      调用验证方法     接收验证结果
//        Set<ConstraintViolation<TesteBean>> set = validator.validate(tb);
//
//
//        for(ConstraintViolation<TesteBean> c : set){
//            System.out.println(c.getPropertyPath()+"---"+c.getMessage());
//        }
//    }

//          快速失败机制
    public static void main(String[] args){

        Validator validator = Validation.byDefaultProvider()
                .configure().addProperty("hibernate.validator.fail_fast","true")
                .buildValidatorFactory().getValidator();

        HashMap<String,String> map = new HashMap<>();
        map.put("",""); //  算是有值
        TesteBean tb = new TesteBean("","");

        Set<ConstraintViolation<TesteBean>> set = validator.validate(tb);

        for(ConstraintViolation<TesteBean> c : set){
            System.out.println(c.getPropertyPath()+"---"+c.getMessage());
        }

    }


}
