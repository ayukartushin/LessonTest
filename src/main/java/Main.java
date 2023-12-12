import objects.Animal;
import objects.Device;
import tables.AnimalTable;
import tables.DevicesTable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AnimalTable animalsTable = new AnimalTable();
        ArrayList<Animal> animals = animalsTable.selectAll();
        if(animals.isEmpty()) {
            animalsTable.insert(new Animal("кошка", "Барсик", "Белый", 12, 5));
            animalsTable.insert(new Animal("собака", "Тузик", "Черный", 15, 4));
            animalsTable.insert(new Animal("утка", "Утя", "Желтый", 3, 3));
            animals = animalsTable.selectAll();
        }

        for (Animal tmp:animals) {
            System.out.println(tmp.toString());
        }

        animals.get(3).setName("Силя");
        animalsTable.update(animals.get(3));

        System.out.println();
        animals = animalsTable.selectAll();
        for (Animal tmp:animals) {
            System.out.println(tmp.toString());
        }

        animalsTable.delete(5);

        System.out.println();
        animals = animalsTable.selectAll();
        for (Animal tmp:animals) {
            System.out.println(tmp.toString());
        }
    }
}
