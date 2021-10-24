

public class Lecture{

    // MAIN
    public static void main(String[] args) {
        
        Person p1 = new Person("Emin",22);

        System.out.println(p1);

    }

    // Attribute
    String name;
    Person lecturer;

    // Constructor

    // Behaviour


    
}


class Person {

    // Attributes
    String name;
    int age;
    String id;

    // Constructor
    public Person(){
        this.name = "Default";
        this.age = 0;
        id = "0";
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
        this.id = "0";
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.id = "0";
    }


    public String toString(){

        String content = " Person "  + this.id + "\n" +
                        " Name: " + this.name + "\n" +
                        " Age: " + this.age + "\n\n";


        return content;

    }
    
    
}
