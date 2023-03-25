package presentation;

import dao.IDao;
import ext.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pers2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        String metierClassname=scanner.nextLine();
        Class cMetier=Class.forName(metierClassname);
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

      // Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
       //setDao.invoke(metier,dao);
       double res=metier.calcule();
        System.out.println("RES: "+res);

    }
}
