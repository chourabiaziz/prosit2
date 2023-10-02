import java.util.Arrays;

public class Zoo {

    Animal [] animals;
    String name ;
    String city ;
    int nbrCages ;
    int nbrAnimals = 0 ;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];

    }

     void displayZoo() {
         System.out.println("my name is "+name +", my city is "+ city + ", my cages number is " + nbrCages);
     }
    public boolean addAnimal(Animal animal) {

        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            return false;
        }
    }
    void displayZooAnimals() {
        System.out.println("les animaux dans la classe zoo sont : "+Arrays.toString(animals) );
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
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

         if (nbrAnimals < nbrCages) {
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


}
