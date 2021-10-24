

public class Lecture{

    // MAIN
    public static void main(String[] args) {
        
        Person p1 = new Person("Emin",22);
        System.out.println(p1);

        Lecture l1 = new Lecture("IE246 Course", p1);

        l1.add_student(new Person("Kağan", 20));
        l1.add_student(new Person("Beril", 21));
        l1.add_student(new Person("Merve", 22));

    }

    // Attribute
    String name;
    Person lecturer;
    Person[] students = new Person[20];

    // Constructor
    public Lecture(String name,Person lecturer){
        this.name = name;
        this.lecturer = lecturer;
    }

    // Behaviour
    public void add_student(Person student){

        for(int i = 0 ; i < this.students.length ; i++){
            if(this.students[i] == null){
                this.students[i] = student;
            }
        }

    }

    
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
