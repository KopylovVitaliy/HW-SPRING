package config;


import driver.Driver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import transport.*;

@Configuration
public class AppConfig {

    @Bean(name = "Car")
    public Car getCarBean() {
        return new Car("CAR");
    }
    @Bean(name = "Pickup")
    public Pickup getPickupBean() {
        return new Pickup("Pickup");
    }
    @Bean(name = "Bus")
    public Bus getBusBean() {
        return new Bus("BUS");
    }
    @Bean(name = "driverCar")
    public Driver getDriverCarBean() {
        return new Driver("Вася", getCarBean());
    }
    @Bean(name = "driverBus")
    public Driver getDriverBusBean() {
        return new Driver("Петя", getBusBean());
    }

    @Bean(name = "driverPickup")
    public Driver getDriverPickupBean() {
        return new Driver("Игорь", getPickupBean());
    }
}