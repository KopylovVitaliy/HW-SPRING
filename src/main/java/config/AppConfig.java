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
    @Qualifier("Car")
    public Driver getDriverCar() {
        return new Driver("Вася");
    }

    @Bean(name = "driverBus")
    @Qualifier("Bus")
    public Driver getDriverBus() {
        return new Driver("Вася");
    }

    @Bean(name = "driverPickup")
    @Qualifier("Pickup")
    public Driver getDriverPickup() {
        return new Driver("Вася");
    }
}