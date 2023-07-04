package Collection;

import java.util.*;

public class CollecionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(1235);
        list.add(1423);
        list.add(1253);
        list.add(123);
        list.set(1, 6786);
        list.remove(0);


        Collections.sort(list);
        List AB = new ArrayList();

        AB.add(12);
        AB.clear();
        AB.add("Sameer");
        AB.addAll(list);
        System.out.println(list.equals(AB));

        System.out.println(AB);
        System.out.println(list);
        System.out.println(list.contains(123));
        System.out.println(list.isEmpty());
        System.out.println(list.listIterator());
        System.out.println(list.iterator());
        System.out.println(list.indexOf(12));
        System.out.println(list.size());
        System.out.println(AB.size());
        System.out.println(  list.get(0));



    }

}
