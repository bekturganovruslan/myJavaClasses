import javax.print.attribute.standard.PagesPerMinute;

    public class InitTest{


        public static void main(String[] args) throws Exception{
            int i = 1, j = 10;
            System.out.println(i+" "+j);
            do {
                if (i++ > --j)
                    continue;
                System.out.println(i+" "+j);
            } while (i < 5);
            System.out.println("i=" + i + " j=" + j);
        }
    }

