package smart.home.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {


    private StacjaPogodowa stacjaPogodowa;

    SterownikRolet() {}

    @Autowired
    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }


    public void print() {
        String howIs;
        String willDo;
        if (stacjaPogodowa.isSunny() == true) {
            howIs = "slonecznie";
            willDo = "Zaslaniam rolety";
        }else {
            howIs = "pochmurnno";
            willDo = "Nie zaslaniam rolet";
        }
        System.out.printf("Jest %s. %s.\n", howIs, willDo);
    }
}
