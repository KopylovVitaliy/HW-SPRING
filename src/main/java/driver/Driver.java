package driver;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import transport.Transport;
@Getter
public class Driver {
    private String name;

    private Transport transport;

    public Driver(String name) {
        this.name = name;
    }
    @Autowired
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return name;
    }
}