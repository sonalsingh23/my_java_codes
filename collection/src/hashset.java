import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();//default capacity is 16 and load factor is 0.75
        //HashSet hs1=new HashSet(100,(float) 0.90);
       // HashSet <Integer> hs2=new HashSet<Integer>();
        //Add object or elements in hashset
        hs.add("welcome");
        hs.add(2);
        hs.add("Hashset");
        System.out.println(hs); //[2, Hashset, welcome]
hs.remove(2);

        System.out.println(hs);

        System.out.println(hs.contains("welcome"));//check the value is present in it or not
        //reading the object or element in hashset
       /* for (Object e:hs)
        {
            System.out.print(e);
        }*/
        /*Iterator it=hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/

    }
}
