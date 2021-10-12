package BasicsProgram;

public class App{

    public static void main(String[] args) {
        
        Shape tri = new Shape("Triangular");
        Shape rect = new Shape("Rectangular");
        Shape dim = new Shape("Diamond",20,'I');

        System.out.println(tri);
        System.out.println(rect);
        System.out.println(dim);

    }


}