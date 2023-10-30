import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                // Declaring the ArrayList
                ArrayList<Integer> arrli= new ArrayList<Integer>();

                // Appending new elements at
                // the end of the list
                for (int i = 1; i <= 10; i++)
                    arrli.add(i);

                // Printing elements
                System.out.println(arrli);

                // Remove element at index 3
                arrli.remove(3);

                // Displaying the ArrayList
                // after deletion
                System.out.println(arrli);

                udskrivListe(arrli);
                udskrivListe1(arrli);
            }

            public static void udskrivListe(ArrayList<Integer> liste){
                for (int i = 0; i < liste.size(); i++)
                    System.out.print(liste.get(i) + " ");
                System.out.println();
            }

            public static void udskrivListe1(ArrayList<Integer> liste){
                for (Integer tal:liste)
                    System.out.print(tal+" ");
                System.out.println();
            }
        }
