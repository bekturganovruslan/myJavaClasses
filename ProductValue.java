public class ProductValue {
    public static void main(String[] args) {

      int number=123456;
      int sum=0;
      int productNum=1;
      while(number>0){
          int remainder=number%10;
          sum+=sum+remainder;
          productNum*=remainder;
          number/=10;

      }

      int productValue=productNum-sum;
        System.out.println("Product Value is: "+productValue);
    }
}
