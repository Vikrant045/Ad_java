import java.util.*;
public class Collections {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("vikrant");
        list.add("vikrant1");
        list.add("vikrant2");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
    
}
+