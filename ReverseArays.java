import java.util.Arrays;

public class ReverseArays {

    public static void main(String[] args) {

        String [] names=new String[]{"Ruslan", "Tima", "Arslan","Nazgul"};
        String[] reversedNames=new String[names.length];

        for(int i=0; i<names.length; i++){
            String reversed="";

            for(int j=names[i].length()-1; j>=0; j--){

                char letter=names[i].charAt(j);
                reversed+=letter;
            }

            reversedNames[i]=reversed;
        }
        System.out.println(Arrays.toString(reversedNames));
    }
}
