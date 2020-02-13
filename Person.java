public class Person {
    
    // Instance Variables/Attributes
    String fname;
    String lname;
    int age;
    String nationality;
    int birthyear;
    float weight;

    // Methods here
    void sayHello(){
        System.out.println("Hi");
    }

    int yearGoneBy(){
        age++;
        return age;
    }

    float eating(float food){
        weight += food;
        return weight;
    }

    String marriage(String married) {
        lname = married;
        return lname;
    }
}