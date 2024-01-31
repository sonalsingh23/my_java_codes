import java.util.*;
public class demo {
    static boolean stringSearch(String str,char target)
    {

        if (str.length()==0)
        {
            return false;
        }
        for (int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="sonal";
        char target='o';
        System.out.println(stringSearch(str,target));
    }
}


