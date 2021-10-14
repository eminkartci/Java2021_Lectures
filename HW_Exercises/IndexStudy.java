package HW_Exercises;

public class IndexStudy {

    public static void main(String[] args) {
        
        double[] doubleArgs = new double[args.length];

        for(int i =0 ; i < args.length ; i++){
            doubleArgs[i] = Double.parseDouble(args[i]);
        }

        chain(doubleArgs);
    }

    public static void fibonacci_like(int[] numbers,int totalCount){


        int[] result = new int[totalCount];

        for(int i = 0 ; i < numbers.length ; i++){
            result[i] = numbers[i];
        }

        for(int i = numbers.length ; i < totalCount ; i++ ){

            result[i] = result[i-1] + result[i-2] + result[i-3];
            
        }
    

    }

    public static void chain(double[] values){

        double[] result = new double[10];

        if(values.length != 3){
            System.out.println("Only 3 double values should be given!");
        }else{
            for(int i = 0 ; i < 3 ; i++){
                result[i] = values[i];
            }

            for(int i = 3 ; i < 10 ; i++){
                result[i] = result[i-1] + result[i-2] + result[i-3];
            }

            for(double x: result){
                System.out.print(x + " ");
            }
        }

    }

    
}
