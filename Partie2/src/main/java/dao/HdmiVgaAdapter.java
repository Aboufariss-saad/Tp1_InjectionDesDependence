package dao;
import dao.HDMI;
import dao.VGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class HdmiVgaAdapter implements VGA {
    HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }
    @Override
    public void print(String message) {
        byte[] b=message.getBytes();
        hdmi.print(b);
    }
}
