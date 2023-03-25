package metier;

import dao.USB;
import dao.VGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UniteCentral  {

    VGA vga;
    USB usb;
    public UniteCentral(VGA vga, USB usb) {
        this.vga= vga;
        this.usb = usb;
    }

    public int readData(){

        return usb.read() ;
    }
    public void  printData(String data){
        vga.print(data);
    }

}
