package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika{


    private MessageProducer producer;

    SterownikGlosnika() {}

    @Autowired
    public SterownikGlosnika(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        String isSunny = null;
        int temp = producer.getTemperature();
        if (producer.isSunny() == true) {
            isSunny = "sloneczniee";
        } else {
            isSunny = "pochmurno";
        }
        System.out.printf("Dzien dobry. Dzisiejsza temperatura %d*C i jest %s. To bedzie dobry dzien.\n", temp, isSunny);
    }
}
