package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring bean : instantiated");
    }

    public void test() {
        System.out.println("spring bean test method invoked");
    }
}
