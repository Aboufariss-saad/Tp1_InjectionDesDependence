package dao;
import org.springframework.stereotype.Component;
@Component
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version Base de donnees");
        double data=50;
        return data;
    }
}
