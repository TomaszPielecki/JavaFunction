import java.util.ArrayList;

public class Kolekcje {
    public static void main(String[] args) {
        String str1 = "Anna";
        String str2 = "Adam";
        String str3 = "Wiola";
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add(str1);
        arraylist.add(str2);
        arraylist.add(str3);
        System.out.println(arraylist);
        arraylist.remove(0);

        Object obj = arraylist.get(1);
        String name = (String) obj;
        System.out.println(name);
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tom");
        String names = "adam";
        list2.add(names);

        for (String str : list2) {
            System.out.println(str);
        }

    }
}
