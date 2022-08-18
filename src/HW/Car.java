package HW;

public class Car {
    private int num;
    private int id;

    public Car(int num, int id) {
        this.num = num;
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "num=" + num +
                ", id=" + id +
                '}';
    }
}
