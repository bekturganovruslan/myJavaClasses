public class MorseCode {

    public static String strangeLatin(String  input){
        String[] arr=input.split(" ");
        String[] vowels={"a","e","i","o","u"};
        String str="";
        for(int i=0; i<arr.length; i++){
            if(arr[i].startsWith(vowels[i])) {
                arr[i] = arr[i] + "maa";
                str = str + " " + arr[i];
            }else{
                char ch=arr[i].charAt(0);
                arr[i]=arr[i].substring(1)+ch+"maa";
                str=str+" "+arr[i];
            }
        }
        return str;

    }

    public static void main(String[] args) {
        String str="I speak latin";
        System.out.println(strangeLatin(str));
    }
}
