package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {


    private MessageProducer producer;

    SterownikPieca() {}

    @Autowired
    public SterownikPieca(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        String howIs = null;
        String heaterStatus = null;

        if (producer.getTemperature() < 15) {
            howIs = "zimno";
            heaterStatus = "Uruchamiam piec";
        }else {
            howIs = "cieplo";
            heaterStatus = "Nie uruchamiam pieca";
        }

        System.out.printf("Jest %s. %s.\n", howIs, heaterStatus);
    }
}
