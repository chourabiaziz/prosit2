
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal() ;
        lion.name ="snoopy" ;
        lion.age =5 ;
        lion.family="cats" ;
        lion.isMammal= true ;
        Animal lion2 = new Animal() ;
        lion2.name ="snoopy" ;
        lion2.age =5 ;
        lion2.family="cats" ;
        lion2.isMammal= true ;

        Animal zebra = new Animal() ;
        zebra.name ="zebra" ;
        zebra.age =15 ;
        zebra.family="horses" ;
        zebra.isMammal= true ;

        Animal horse = new Animal() ;
        horse.name ="zebra" ;
        horse.age =15 ;
        horse.family="horses" ;
        horse.isMammal= true ;

        Zoo myZoo =new Zoo("wildlife", "ariana" , 25) ;
        myZoo.displayZoo();
        System.out.println("myzoo :" + myZoo);
        System.out.println("methode to string :"+ myZoo.toString());
       System.out.println( myZoo.addAnimal(lion));
        System.out.println( myZoo.addAnimal(zebra));

        myZoo.displayZooAnimals();
        System.out.println("-------------search--------------------");
        int isExist = myZoo.searchAnimal(lion);
        System.out.println(isExist);
        if (isExist != -1) {
            System.out.println("Animal found at index: " + isExist);
        } else {
            System.out.println("Animal not found.");
        }


//add animal plus optimale (instruction 12 )
        System.out.println( myZoo.addAnimal2(lion));
        System.out.println(  myZoo.addAnimal2(zebra));
        System.out.println( myZoo.addAnimal2(horse));
        System.out.println( myZoo.addAnimal2(lion2));

        myZoo.displayZooAnimals();

//supprimer un animal

        boolean removed = myZoo.removeAnimal(lion);

        if (removed) {
            System.out.println("animal a éte supprimé.");
        } else {
            System.out.println("animal n'exist pas ");
        }

        myZoo.displayZooAnimals();

        System.out.println("----------comparer--------");
        compareZoo


    }




}