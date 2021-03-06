package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {


    private StacjaPogodowa stacjaPogodowa;

    SterownikPieca() {}

    @Autowired
    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void print() {
        String howIs = null;
        String heaterStatus = null;

        if (stacjaPogodowa.getTemperature() < 15) {
            howIs = "zimno";
            heaterStatus = "Uruchamiam piec";
        }else {
            howIs = "cieplo";
            heaterStatus = "Nie uruchamiam pieca";
        }

        System.out.printf("Jest %s. %s.\n", howIs, heaterStatus);
    }
}
