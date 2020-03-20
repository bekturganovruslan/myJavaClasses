import java.util.Arrays;
public class AppendStringBuilder {

    public static void main(String[] args) {

        StringBuilder wierd =new StringBuilder("ASDFKJAGFPW32KEJFQ40NASDEHJGE22KVNDMNAPWRNJFV4307ASDF");
        StringBuilder result=new StringBuilder();

        for(int i=0; i<=wierd.length()-1; i++){
            if(wierd.charAt(i) >= 'D' &&  wierd.charAt(i) <= 'G'){
            result.append(wierd.charAt(i));
            }
        }
        System.out.println(result);
    }
}
