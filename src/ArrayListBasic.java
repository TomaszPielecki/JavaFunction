import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add(new String("info"));

        String strEl=(String)basicList.get(0);
        System.out.println(strEl);

        ArrayList<String> arrList= new ArrayList<>();
        arrList.add("Kasia");
        arrList.add("Adam");
        arrList.add("Tomek");
        arrList.add("Zosia");
        arrList.remove(2);
        arrList.add("Olek");

        for(String s: arrList){
            System.out.println(s+",");
        }
        arrList.set(0,"Katarzyna");
        for(String w: arrList){
            System.out.println(w+",");
        }
        //Sorting order
        System.out.println("\nAfter Sorting");
        Collections.sort(arrList);
        for(String o: arrList){
            System.out.println(o+",");
        }

    }
}
