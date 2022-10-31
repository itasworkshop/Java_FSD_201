public class TestArray {

    public static void main(String[] args){
        /*
        String names[] = new String[5];
        names[0] = "Raj";
        names[3] = "Rajesh";

         */

        String[] names  = {"Rajesh","Suraj","Tom"};
        String[] newnames = new String[3];
        int n = 2;
        for (int i=0;i<names.length;i++) {
            System.out.println(n-i);
            newnames[n -i] =names[i];
            //System.out.println(newnames[i]);
        }

        for (int i=0;i<newnames.length;i++) {
            System.out.println(newnames[i]);
        }

    }
}
