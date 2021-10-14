package BasicsProgram;

public class App{
    public static void main(String[] args) {

        Shape userShape = new Shape("Diamond");
        Shape.save_str(userShape.triangularStr(), "userShape");
        System.out.println(userShape);
    }


}