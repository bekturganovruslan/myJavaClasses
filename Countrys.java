import java.util.Arrays;

public class Countrys {
    public static void main(String[] args) {


        StringBuilder cor = new StringBuilder("Corolla");
        StringBuilder c30 = new StringBuilder("C300");
        StringBuilder cam = new StringBuilder("Camry");
        StringBuilder acc = new StringBuilder("Accord");
        StringBuilder ura = new StringBuilder("Acura");

        StringBuilder[] arr1 = new StringBuilder[]{cor, c30, cam, acc, ura};

        int j = 0;
        StringBuilder[] result =new StringBuilder[arr1.length];
        for (int i = arr1.length - 1; i >= 0; i--) {

           result[j++] = arr1[i].reverse();
        }

        System.out.println(Arrays.toString(result));



        int count=0;
        int in=0;
        StringBuilder[] result1 =new StringBuilder[arr1.length];
        for(StringBuilder model : arr1){
           result1[count++]=model;

        }
        System.out.println(Arrays.toString(result1));


    }
}
