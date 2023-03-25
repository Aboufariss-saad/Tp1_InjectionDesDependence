package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXml {
    public static void main(String[] args) {
        ApplicationContext Context=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= (IMetier) Context.getBean("metier");
        System.out.println(metier.calcule());
    }
}
