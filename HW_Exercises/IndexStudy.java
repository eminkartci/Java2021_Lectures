package HW_Exercises;

public class IndexStudy {

    public static void main(String[] args) {
        


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

    
}
