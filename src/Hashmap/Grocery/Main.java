package Hashmap.Grocery;


import java.util.*;


public class Main {
    static HashMap<Integer, Product> map = new HashMap<>();

    static ArrayList<Product> list = new ArrayList<>(map.values());

    static Product searchbyname(String name) {
        for (int a : map.keySet()) {
            Product p = map.get(map.get(a));
            if (p.getName() == name)
                return p;
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<Integer, Product> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        Product p2 = new P(101, "Chips", 25, 2);
        Product p3 = new T(108, "Cold Drink", 99, 3);
        Product p4 = new P(105, "Ice cream", 20, 5);
//        p2.details();

        map.put(p2.getP_id(), p2);
        map.put(p3.getP_id(), p3);
        map.put(p4.getP_id(), p4);

    }

    static void sorting() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product p2, Product p3) {
                return Integer.compare(p2.getPrice(), p3.getPrice());
            }
        });
        list.sort(Comparator.comparingInt(Product -> Product.getPrice()));

//
    }
}
