package HW_Exercises;

public class Triangle {

    public static void main(String[] args) {
        
        triangle(Integer.parseInt(args[0]));

    }


    public static void triangle(int length){

        if(length <= 0){
            System.out.println("Provide a positive value");
            return;
        }

        double area = 0;

        
        draw_righttriange(length);
        area = calculateArea((double) length);

        System.out.println("Area is " + area);


    }

    public static double calculateArea(double length){

        return length * length / 2.0;

    }

    public static void draw_righttriange(int length){
        // iteare rows
        for(int row = 0 ; row < length ; row++){

            // // SPACE
            // for(int space = 0 ; space < length -1 - row; space ++){
            //     System.out.print(" ");
            // }

            // Star
            for(int star = 0 ; star <  row + 1 ; star++){
                System.out.print("*");
            }

            // New Line
            System.out.println();

        }
    }
    
}
