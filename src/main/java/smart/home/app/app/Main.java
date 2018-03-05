package smart.home.app.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smart.home.app.beans.*;

@Configuration
@ComponentScan(basePackages = "smart.home.app")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Main.class);

        SmartHome smartHome = ctx.getBean(SmartHome.class);
        smartHome.print();


        SterownikGlosnika sterownikGlosnika = ctx.getBean(SterownikGlosnika.class);
        sterownikGlosnika.print();

        SterownikPieca sterownikPieca = ctx.getBean(SterownikPieca.class);
        sterownikPieca.print();

        SterownikRolet sterownikRolet = ctx.getBean(SterownikRolet.class);
        sterownikRolet.print();

        ctx.close();
    }
}
