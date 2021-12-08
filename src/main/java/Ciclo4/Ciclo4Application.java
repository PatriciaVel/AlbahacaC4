package Ciclo4;

import Ciclo4.interfaces.InterfaceUser;
import Ciclo4.interfaces.InterfaceVegetarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Ciclo4Application implements CommandLineRunner{
    @Autowired
    private InterfaceVegetarian interfaceVegetarian;
    @Autowired
    private InterfaceUser interfaceUser;

    public static void main(String[] args) {
        SpringApplication.run(Ciclo4Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception{
        interfaceVegetarian.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
