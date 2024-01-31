import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class collection1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Enter five interger :");
        for (int i=0;i<=5;i++)
        {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println("Elements in integers :");

            for (int x:arrayList)
            {

                System.out.println(x);
            }

        }
    }

