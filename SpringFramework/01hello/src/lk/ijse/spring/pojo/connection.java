package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class connection {
    public connection(){
        System.out.println("Connection : Instantiated");
    }
    public void getConnection(){
        System.out.println("return connection");
    }
}
