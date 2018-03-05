package smart.home.app.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import smart.home.app.beans.*;

@Configuration
@ComponentScan(basePackages = "smart.home.app")
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Main.class);

        SmartHome smartHome = ctx.getBean(SmartHome.class);
        smartHome.print();
        ctx.close();
    }
}
