package collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kanikey");
        arrayList.add("Samira");
        arrayList.add("Ainazik");
        arrayList.add("Aigerim");

        ArrayList<String> list = new ArrayList<>();

        list.add("Dastan");
        list.add("Nurik");
        list.add("Shurik");

        System.out.println(arrayList.removeAll(list));

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
