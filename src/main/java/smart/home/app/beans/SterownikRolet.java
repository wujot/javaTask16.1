package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {


    private MessageProducer producer;

    SterownikRolet() {}

    @Autowired
    public SterownikRolet(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        String howIs;
        String willDo;
        if (producer.isSunny() == true) {
            howIs = "slonecznie";
            willDo = "Zaslaniam rolety";
        }else {
            howIs = "pochmurnno";
            willDo = "Nie zaslaniam rolet";
        }
        System.out.printf("Jest %s. %s.\n", howIs, willDo);
    }
}
