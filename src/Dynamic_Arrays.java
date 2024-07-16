//ARRAYLIST - COLLECTION

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.contains(20));

        list.set(1, 66);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

//        input
        System.out.println("Enter any 5 numbers to list:");
        for (int i=0; i<5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

//        get element at any index
        for (int i = 0; i < 8; i++) {
            System.out.println("Index at "+i+" index - "+ list.get(i));
//            pass index in get(), list[index] won't work here.
        }

//        MULTIDIMENSIONAL ARRAY LIST
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();

//        initialization
        for (int i = 0; i < 3; i++) {
            ml.add(new ArrayList<>());
        }

//        add elements
        System.out.println("Enter elements for Dynamic List -Array List - 2D MATRIX");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ml.get(i).add(in.nextInt());  //get(i) - gets the row at this index i and then adds elements to that index AL
            }
        }

        System.out.println(ml);



    }
}
