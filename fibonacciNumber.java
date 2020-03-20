public class fibonacciNumber {

     public static boolean PolindromeNumber(int number){

            int reversedNumber=0;
            int OriginalNumber=number;
            while(number != 0){

                int remainder=number%10;
                reversedNumber=reversedNumber*10+remainder;
                number=number/10;
            }

            if(OriginalNumber==reversedNumber){
                return true;
            }else
                return false;
        }

    public static void main(String[] args) {
        System.out.println(PolindromeNumber(1234321));

    }
}
