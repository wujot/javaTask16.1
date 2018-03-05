package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika{


    private  StacjaPogodowa stacjaPogodowa;

    SterownikGlosnika() {}

    @Autowired
    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void print() {
        String isSunny = null;
        int temp = stacjaPogodowa.getTemperature();
        if (stacjaPogodowa.isSunny() == true) {
            isSunny = "sloneczniee";
        } else {
            isSunny = "pochmurno";
        }
        System.out.printf("Dzien dobry. Dzisiejsza temperatura %d*C i jest %s. To bedzie dobry dzien.\n", temp, isSunny);
    }
}
