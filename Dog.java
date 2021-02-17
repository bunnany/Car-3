import java.util.Scanner;
/**
 * Dogs have hair colour and type
 * As defined here they can only bark
 *
 * @author Ny
 * @version 11/02/21
 */
public class Dog
{
    // fields
    private String colour;
    private String hair;
    private int age;

    /**
     * Constructor for objects of class Dog
     * Construct a new Dog object
     * 
     * @param col       a string for the colour of the dog's hair
     * @param hairtype  a string for the type of hair the dog has
     * @param years     an int giving the dogs age in years
     * 
     */
    public Dog(String col, String hairtype, int years)
    {
        colour = col;
        hair = hairtype;
        age = years;
    }

    /**
     * prints "Woof!"
     */
    public void bark()   {
        System.out.println("Mong Mong!");
    }
    
    /**
     * returns age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * returns age in dog years
     */
    public double dogYears() {
        double dogAge;  // declare var
        if (this.age <= 2) {
            dogAge = this.age * 10.5;
        } else {
            dogAge = ((this.age - 2) * 4) + 21;
        }
        return dogAge;
    }
    
    /**
     * Main
     * Create two dogs. Make them bark.
     * Says its age
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        Dog noodle = new Dog("white", "short", 5);
        Dog kimchi = new Dog("tan", "fluffy", 1);
        noodle.bark();
        kimchi.bark();
        System.out.println(noodle.getAge());
        System.out.println(kimchi.getAge());
        System.out.println(noodle.dogYears());
        System.out.println(kimchi.dogYears());
    //Write a method to show a dog’s coat colour and type.
    //Add a third dog to the main function, and make it bark too.
    
    }
}
