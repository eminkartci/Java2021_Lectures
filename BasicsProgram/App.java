package BasicsProgram;

public class App{

    public static void main(String[] args) {
        
        Shape tri = new Shape("Triangular");
        Shape rect = new Shape("Rectangular");
        Shape dim = new Shape("Diamond",20,'I');

        Shape userShape = createShape("Diamond");

        // System.out.println(tri);
        // System.out.println(rect);
        // System.out.println(dim);

        System.out.println(userShape);
    }

    public static Shape createShape(String userShapeStr){
        
        Shape tri = new Shape(userShapeStr);
        return tri;
    }


}