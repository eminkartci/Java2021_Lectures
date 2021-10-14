package BasicsProgram;

public class Shape {

    // Attribute
    String shape;
    int h,l;
    char c;

    // Constructor
    public Shape(String shape){
        this.shape = shape;
        this.h = 7;
        this.l = 5;
        this.c = 'o';
    }

        // Triangular
        public Shape(String shape,int h,char c){
            this(shape);
            this.h = h;
            this.c = c;
        }

        // Rectangular
        public Shape(String shape,int h,int l,char c){
            this(shape);
            this.h = h;
            this.l = l;
            this.c = c;
        }

    // Behaviour
    public String toString(){
        
        String content = " --- " + this.shape + " ---\n";

        content += "| Height : " + this.h + "\n";
        content += "| Char   : " + this.c + "\n";

        System.out.println("=== SHAPE "+ this.shape +" ===");
        if(this.shape.equals("Triangular")){
            draw_triangular(this.h, this.c);
        }else if(this.shape.equals("Rectangular")){
            draw_rectangular(h, l, c);
        }else if(this.shape.equals("Diamond")){
            draw_dimond(this.h,this.c);
        }else{
            System.out.println("Your shape is not defined in our software !!");
        }

        return content;
    }



    public static void draw_left_triangular(int h,char c){

        // 1. row 1
        // 2. row 2
        // 3. row 3

        // All Rows
        for(int rowIndex = 0 ; rowIndex < h ; rowIndex++) {

            // ROW
            for (int charCount = 0 ; charCount <= rowIndex ; charCount++){
                System.out.print(c);
            }

            System.out.println();
        }



    }

    public static void draw_right_triangular(int h,char c){

        // 1.row 2  h-1 
        // 2.row 1  h-1 -1
        // 3.row 0  h-1 -2


        // All Rows
        for(int rowIndex = 0 ; rowIndex < h ; rowIndex++) {

            // ROW
                // SPACE
                for(int spaceCount = 0 ; spaceCount < (h-1)-rowIndex ; spaceCount ++){
                    System.out.print(" ");
                }
                // CHAR
                for (int charCount = 0 ; charCount <= rowIndex ; charCount++){                
                    System.out.print(c);
                }

            System.out.println();
        }

    }

    public static void draw_triangular(int h,char c){

        // All Rows
        for(int rowIndex = 0 ; rowIndex < h ; rowIndex++) {

            // ROW
                // SPACE
                for(int spaceCount = 0 ; spaceCount < (h-1)-rowIndex ; spaceCount ++){
                    System.out.print(" ");
                }
                // CHAR
                for (int charCount = 0 ; charCount <= rowIndex ; charCount++){                
                    System.out.print(c);
                }
                // CHAR
                for (int charCount = 0 ; charCount < rowIndex ; charCount++){                
                    System.out.print(c);
                }

            System.out.println();
        }

    }

    public static void draw_rectangular(int h,int l,char c){

        // All Rows
        for(int rowIndex = 0 ; rowIndex < h ; rowIndex++) {

            // ROW - CHAR
            for (int charCount = 0 ; charCount < l ; charCount++){                
                System.out.print(c);
            }
                
            System.out.println();
        }

    }

    public static void draw_dimond(int h,char c){


        // 1  - 1
        // 3  - 2
        // 5  - 3

        /*

          o  
         o o
        o   o
         o o 
          o

        */

        // UPPER
        int upperH = h/2+1;
        for(int rowIndex = 0 ; rowIndex < upperH ; rowIndex++) {

            // ROW
                // SPACE
                for(int spaceCount = 0 ; spaceCount < (upperH-1)-rowIndex ; spaceCount ++){
                    System.out.print(" ");
                }
                // Char
                System.out.print(c);
                //SPACE
                if(rowIndex != 0){
                    for(int spaceCount = 0 ; spaceCount < 2*rowIndex-1 ; spaceCount ++){
                        System.out.print(" ");
                    }
                    System.out.print(c);
                }                

            System.out.println();
        }

        // LOWER
        int lowerH = h/2;
        for(int rowIndex = 0 ; rowIndex < lowerH ; rowIndex++) {

            // ROW
                // SPACE
                for(int spaceCount = 0 ; spaceCount <= rowIndex ; spaceCount ++){
                    System.out.print(" ");
                }
                // Char
                System.out.print(c);
                //SPACE
                for(int spaceCount = 0 ; spaceCount < (h-4)-2*rowIndex ; spaceCount ++){
                    System.out.print(" ");
                }
                if (rowIndex != lowerH-1){
                    System.out.print(c);
                }
            System.out.println();
        }

    }

    
    
}
