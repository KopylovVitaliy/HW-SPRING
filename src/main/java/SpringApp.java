import config.AppConfig;
import driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import transport.*;
import transport.Transport;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Transport transport = context.getBean("Car", Transport.class);
        Transport transport1 = context.getBean("Bus", Transport.class);
        Transport transport2 = context.getBean("Pickup", Transport.class);

        System.out.println(transport + " готов к работе");
        System.out.println(transport1 + " готов к работе");
        System.out.println(transport2 + " готов к работе");

        Driver driver = context.getBean("driverCar", Driver.class);
        Driver driver1 = context.getBean("driverBus", Driver.class);
        Driver driver2 = context.getBean("driverPickup", Driver.class);

        System.out.println(driver);
        System.out.println(driver1);
        System.out.println(driver2);

    }
}