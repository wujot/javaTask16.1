package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa implements MessageProducer{
    private String message;
    private boolean isSunny;
    private int temperature;

    public StacjaPogodowa() {
        int lowTemp = -25;
        int highTemp = 35;
        Random random = new Random();
        temperature = (int) ((Math.random() * ((highTemp - lowTemp) + 1)) + lowTemp);
        isSunny = random.nextBoolean();
        message = "Stacja pogodowa pobiera informacje o temperaturze";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public boolean isSunny() {
        return isSunny;
    }
}
