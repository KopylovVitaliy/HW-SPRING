package transport;

import lombok.Getter;

@Getter
public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }
    public abstract void start();

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}