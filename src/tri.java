/**
 * Created by a on 16/02/17.
 */
public class tri {


    public static boolean checkForUnique (String str){
        boolean containsUnique = false;

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                containsUnique = true;
            } else {
                containsUnique = false;
            }
        }

        return containsUnique;

    }







    public static void main (String[] args) {

        String aaa = "fdsfdsf";


        boolean re = tri.checkForUnique(aaa);

        System.out.print(re);

    }
}
