package HW_Exercises;

public class secMin {


    public static void main(String[] args) {

        try{

            int[] nums = new int[args.length];

            for(int i = 0 ; i < args.length ; i++){

                nums[i] = Integer.parseInt(args[i]);

            }

            secMin(nums);

        }catch(Exception e){

            System.out.println("Please type a valid input!");

        }

        
    }


    public static int secMin(int[] numbers){

        if(numbers.length < 2){
            System.out.println("There is no second minimum !!");
            return 0;
        }

        int minValue = Integer.MAX_VALUE;
        int secMinValue = Integer.MAX_VALUE;
        int minIndex = -1;


        // Find the min value and its index
        for(int i = 0 ; i < numbers.length ; i++){
            // if current number is less than my minValue
            if(minValue > numbers[i]){
                // my new minValue is the current number
                minValue = numbers[i];
                // update its index
                minIndex = i;
            }

        }

        // iterate all numbers
        for(int i =  0; i < numbers.length ; i++){

            // find the minimum expect the minimum index
            if(numbers[i] < secMinValue && i != minIndex){
                secMinValue = numbers[i];
            }

        }

        System.out.println("Second Minimum number: "+secMinValue);
        return secMinValue;





    }
    
}
