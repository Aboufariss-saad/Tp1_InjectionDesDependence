package presentation;

import metier.UniteCentral;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresV_Spring_XML {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UniteCentral uc=context.getBean(UniteCentral.class);
        uc.printData("Hello world");
        System.out.println(uc.readData());
    }
}