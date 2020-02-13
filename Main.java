public class Main {
    public static void main(String[] args) {
        
        // Instance Creations
        // Person personObject1 = new Person();
        //Person personObject2 = new Person();
        Puppy puppyObject1 = new Puppy();
        Puppy puppyObject2 = new Puppy("Max");
        Puppy puppyObject3 = new Puppy("Pup",2,"Dalmation");

        // Instance variable/attribute declaring
        // personObject1.fname = "Jane";
        // personObject1.lname = "Smith";
        // personObject1.age = 24;
        // personObject1.weight = 85;

        // Print instances variables/attributes
        // System.out.println("FirstName is " + personObject1.fname);
        // System.out.println("LastName is " + personObject1.lname);
        // System.out.println("Age is " + personObject1.age);
        // System.out.println("Weight in kg is " + personObject1.weight);
        System.out.println(puppyObject1.name);
        System.out.println(puppyObject2.name);
        System.out.println(puppyObject3.name);
        
        System.out.println(puppyObject1.age);
        System.out.println(puppyObject2.age);
        System.out.println(puppyObject3.age);

        System.out.println(puppyObject1.breed);
        System.out.println(puppyObject2.breed);
        System.out.println(puppyObject3.breed);

        // Call sayHello method to personObject1
        // personObject1.sayHello();
        // // Call yearGoneBy method to personObject1
        // System.out.println("Age1YearLater is " + personObject1.yearGoneBy());
        // // Call eating method to personObject1
        // System.out.println("NewWeight in kg is " + personObject1.eating(1.1f));
       
        // System.out.println("MarriedName is " + personObject1.marriage("Martins"));
       
       
        // Declaring and printing instance variables/attributes
        //personObject2.fname = "Will";
        //System.out.println("FirstName is " + personObject2.fname);
        //personObject2.lname = "Croft";
        //System.out.println("LastName is " + personObject2.lname);
        //personObject2.age = 25;
        //System.out.println("Age is " + personObject2.age);
        // Call sayHello method to personObject2
        //personObject2.sayHello();

        
    }
}