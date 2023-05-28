package transport;

public class Car extends Transport{
    public Car(String model) {
        super(model);
    }

    public void start() {
        System.out.println(getModel() + " заведена");
    }

}
