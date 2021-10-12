package BasicsProgram;

public class Shape {



    public static void draw_triangular(){

        /*

        h = 7

        o
        oo
        ooo
        oooo
        ooooo
        oooooo
        ooooooo

        */

        // 1. row 1
        // 2. row 2
        // 3. row 3

        // All Rows
        for(int rowIndex = 0 ; rowIndex < 7 ; rowIndex++) {

            // ROW
            for (int charCount = 0 ; charCount <= rowIndex ; charCount++){
                System.out.print("o");
            }

            System.out.println();
        }



    }
    
}
