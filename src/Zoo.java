import java.util.Arrays;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES = 25;
    int nbrAnimals = 0;

    public Zoo(String name, String city, int NBR_CAGES) {
        this.name = name;
        this.city = city;
        Zoo.NBR_CAGES = NBR_CAGES;
        this.animals = new Animal[NBR_CAGES];

    }

    void displayZoo() {
        System.out.println("my name is " + name + ", my city is " + city + ", my cages number is " + NBR_CAGES);
    }

    public boolean addAnimal(Animal animal) {

        if (nbrAnimals < NBR_CAGES) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            return false;
        }
    }

    void displayZooAnimals() {
        System.out.println("les animaux dans la classe zoo sont : " + Arrays.toString(animals));
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }


////addition optimale

    public boolean addAnimal2(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("exist déja.");
            return false;
        }

        if (nbrAnimals < NBR_CAGES) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            System.out.println("Le zoo est saturé.");
            return false;
        }
    }

//supprisionn


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index != -1) {
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }

            animals[nbrAnimals - 1] = null;

            nbrAnimals--;
            return true;
        } else {
            return false;
        }
    }

    // COMPARISON

    static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1 ;
        } else if (z2.animals.length > z1.animals.length) {
return z2;}
        else System.out.println("equals");;
        return z1;
    }


    public boolean isZooFull(Zoo zoo) {
             return this.nbrAnimals == this.NBR_CAGES ;
    }


}