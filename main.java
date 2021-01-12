import java.util.Random;

/**
 * numberGen
 */
 class Main {

   public static void main(String[] args) {
        Random dice = new Random();
        int number ;

        for(int counter=1;counter<=10;counter++){
            number=1+dice.nextInt(7);
            System.out.println(number+" ");
        }
    }  
        
    
}
