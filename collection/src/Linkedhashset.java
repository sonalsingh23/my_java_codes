import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
        /*LinkedHashSet l1=new LinkedHashSet();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        l1.add(500);
        //l1.remove(2);
        System.out.println(l1);
        LinkedHashSet l2=new LinkedHashSet();
        l1.add(600);
        l1.add(200);
        l1.add(300);
        l1.retainAll(l2);
        System.out.println(l1);
        /*l1.addAll(l2);
        System.out.println("unioun"+l1);


        l2.add(600);
        System.out.println(l2);
        l2.removeAll(l1);
        System.out.println(l2);*/

                LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
                l1.add(100);
                l1.add(200);
                l1.add(300);
                l1.add(400);
                l1.add(500);

                System.out.println("l1: " + l1);

                LinkedHashSet<Integer> l2 = new LinkedHashSet<>();
                l2.add(600);
                l2.add(200);
                l2.add(300);

                l1.retainAll(l2);

                System.out.println("l1 after retaining elements from l2: " + l1);
            }
        }




