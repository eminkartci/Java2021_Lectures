package HW_Exercises;

public class Chain {

    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("There has to be exactly three numbers");
        }else{
            try{
                chain(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
            }catch(Exception e ){
                System.out.println("Please provide double values only !!");
            }
        }

    }



    public static void chain(double num1, double num2, double num3){

        double newNumber = 0;

        // Iterate 10 numbers
        for(int i = 0 ; i < 10 ; i++){

            if( i < 3 ){
                if(i == 0){
                    System.out.print(num1 + " " );
                }else if(i == 1){
                    System.out.print(num2 + " " );
                }else if(i == 2){
                    System.out.print(num3 + " " );
                }
            }else{
                newNumber = num1 + num2 + num3;
                num1 = num2;
                num2 = num3;
                num3 = newNumber;
                System.out.print(newNumber + " ");
            }

        }

    }
    
}
