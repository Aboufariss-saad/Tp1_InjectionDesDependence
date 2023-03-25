package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Souris implements  USB{
    @Override
    public int read() {
        System.out.println("je suis une souris");
        return (int) (Math.random()*100);
    }
}