package HW;

public class CarDannyi {
    private String model;
    private int godVypuska;
    private String color;
    private int price;

    public CarDannyi(String model, int godVypuska, String color, int price) {
        this.model = model;
        this.godVypuska = godVypuska;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDannyi{" +
                "model='" + model + '\'' +
                ", godVypuska=" + godVypuska +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
