

public class SwitchExample {

    public static void main(String[] args) {
    
        String userSelection = "5";

        switch (userSelection) {

            case "1":
                System.out.println("Giris Yapildi");
                break;
            
            case "2":
                System.out.println("Kredi Başvurusu");
                break;

            case "3":
                System.out.println("Eminevim başvurusu");
                break;
                
                
        
            default:
                System.out.println("Bizi tercih ettiğiniz için teşekkürler.");
                break;
        }

        if(userSelection.equals("1")){
            System.out.println("Giris Yapildi");
        }else if(userSelection.equals("2")){
            System.out.println("Kredi Başvurusu");
        }else if(userSelection.equals("3")){
            System.out.println("Eminevim başvurusu");
        }else{

        }


        
    }
    
}
