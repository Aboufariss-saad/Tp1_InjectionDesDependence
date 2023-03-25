package presentation;
import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class pers1 {
    public static void main(String[] args){
        DaoImplV2 dao=new DaoImplV2();
        MetierImpl metier =new MetierImpl(dao);
        double res=metier.calcule();
        System.out.println("RES: "+res);

    }
}
