package basicpgm;

import java.util.ArrayList;
import java.util.List;

public class ListProperty 
{
public static void main(String[] args) 
{
    List l1 = new ArrayList();
    l1.add(12);
    l1.add(18.90);
    l1.add(true);
    l1.add("Ram");
    l1.add(null);
    l1.add(null);
    l1.add('A');
    System.out.println(l1);
    //It follows indexing 
    //order of insertion
}
}
