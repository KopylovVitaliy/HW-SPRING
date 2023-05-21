package driver;

import lombok.Getter;
import lombok.Setter;
import transport.Transport;
@Getter
@Setter
public class Driver {
    private String name;
    private Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    @Override
    public String toString() {
        return name;
    }
}