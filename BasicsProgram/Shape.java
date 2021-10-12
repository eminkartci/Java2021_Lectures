package BasicsProgram;

public class Shape {



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
    
}
