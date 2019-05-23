package bobkin.test.hashmap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int key;
        long value;
        int size = 10;

        HashMap map = new HashMap(size);
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("1\t Enter size map");
                System.out.println("2\t Enter key, click enter");
                System.out.println(" \t Enter value");
                System.out.println("3\t Enter key for get value");
                System.out.println("4\t Check isKey");
                System.out.println("5\t Check size HashMap");
                System.out.println("6\t Finish");
                System.out.println("Please enter your choice:");
                System.out.println(" ");

                int choice = sc.nextInt();
                if (choice == 1) {
                    key = sc.nextInt();
                    map = new HashMap(key);
                } else if (choice == 2) {
                    key = sc.nextInt();
                    value = sc.nextLong();
                    map.put(key, value);
                } else if (choice == 3) {
                    key = sc.nextInt();
                    map.get(key);
                } else if (choice == 4) {
                    key = sc.nextInt();
                    map.containsKey(key);
                } else if (choice == 5) {
                    map.size();
                } else if (choice == 6) {
                   break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
