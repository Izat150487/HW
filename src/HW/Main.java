package HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Car деген класс тузунуз (Id, номер авто)
        //Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        //HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        //HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.
        HashMap<Car,CarDannyi> car = new HashMap<>();
        car.put(new Car(7337,1),new CarDannyi("Mers",2021,"black",50000));
        car.put(new Car(7117,2),new CarDannyi("Toyota",2022,"blue",60000));
        car.put(new Car(7777,3),new CarDannyi("Lexus",2022,"white",65000));

        for (HashMap.Entry map : car.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        
    }
}
