public class Puppy {
    //Instance variable
    String name;
    int age;
    String breed;

    //Default constructor
    Puppy(){
        name = "placeholder"; // Assigns default name for a Puppy instance
    }

    // Parametised constructor
    Puppy(String newName){
        name = newName;
    }

    // Parametised constructor
    Puppy(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }
}