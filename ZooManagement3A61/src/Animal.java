public class Animal {

    String family;
    String name;
    int age ;
    boolean isMammal ;
    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    public String displayAnimal() {
        return
                "name='" + name + '\'' +
                        ", family='" + family + '\'' +
                        ", age=" + age  + '\''+
        ", isMammal=" + isMammal ;
    }

    public String getName() {
        return name;
    }
}
