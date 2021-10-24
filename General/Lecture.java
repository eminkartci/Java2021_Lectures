import java.util.ArrayList;
import java.util.HashMap;

public class Lecture{

    // MAIN
    public static void main(String[] args) {
        
        Person p1 = new Person("Emin",22);
        // System.out.println(p1);

        Lecture l1 = new Lecture("IE246 Course", p1);

        l1.add_student_list(new Person("Kağan", 20));
        l1.add_student_list(new Person("Beril", 21));
        l1.add_student_list(new Person("Merve", 22));

        l1.add_student_hash("gezen", new Person("Merve", 22));
        l1.add_student_hash("yatirimci", new Person("Kagan", 20));
        l1.add_student_hash("beril", new Person("Beril", 21));

        l1.showStudent(2);
        l1.showStudentHash("baterist");

        l1.reportStudentCount();

    }

    // Attribute
    String name;
    Person lecturer;
    Person[] students = new Person[20];
    ArrayList<Person> clients = new ArrayList<Person>();
    HashMap<String,Person> persons = new HashMap<String,Person>();

    // Constructor
    public Lecture(String name,Person lecturer){
        this.name = name;
        this.lecturer = lecturer;
    }

    // Behaviour
    public void add_student_arr(Person student){

        for(int i = 0 ; i < this.students.length ; i++){
            if(this.students[i] == null){
                this.students[i] = student;
            }
        }

    }

    public void add_student_list(Person student){
        this.clients.add(student);
    }

    public void add_student_hash(String key,Person student){
        this.persons.put(key, student);
    }

    public void showStudent(int studentIndex){
        System.out.println(this.clients.get(studentIndex));
    }

    public void showStudentHash(String key){
        System.out.println(this.persons.get(key));
    }

    public void reportStudentCount(){
        System.out.println(this.clients.size());
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
