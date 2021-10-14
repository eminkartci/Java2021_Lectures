package BasicsProgram;

public class App{
    public static void main(String[] args) {

        Shape userShape = createShape("Diamond");
        System.out.println(userShape);
    }

    public static Shape createShape(String userShapeStr){
        
        Shape userShape = new Shape(userShapeStr);
        return userShape;
    }


}