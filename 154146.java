/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advance.programming;
import java.util.ArrayList;
import Java.util.Vector;
import Java.util.*;
import java.util.Arrays;
import static java.util.EnumSet.copyOf;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 *
 * @author hp
 */
public class AdvanceProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // code snippet for arraylist 
        ArrayList A = new ArrayList( );
         A.add(1);
         A.add(2);
         A.add(3);
         A.add(4);
         A.remove(1);
         System.out.println(A);
        System.out.println(A.size());
        //----------------------------------------------------------------------
        
        //code snippet for vector
        
        Vector V= new Vector( );
        V.add(1);
        V.add(2);
        V.add(3);
        V.add(4);
       // System.out.println(V.capacity());
       // ------------------------------------------------------------------------
        
       //code snippet for Hash set sorted set
       
       String[] intro={"I","am","a","student"};
       List <String> list=Arrays.asList(intro);
       System.out.println(list);
       
      // Set<String> s=new HashSet<String>(list);
       //System.out.println(s);
        //----------------------------------------------------------------------

       //code snippet for  sorted set         
      
        SortedSet<Integer> setNumbers = new TreeSet<>();
        setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9));
        System.out.println("Sorted Set: " + setNumbers);
        //----------------------------------------------------------------------
    
        //tree set
         Set integerSet;
        integerSet = new TreeSet();
        integerSet.add(17);
        integerSet.add(18);
        integerSet.add(4);
        integerSet.add(9);
         
        System.out.println(integerSet.toString());
        //----------------------------------------------------------------------
        
        //array example code
        
        int[] a;                    // declare the array
        a = new int[4];             // create the array
        for (int i = 0; i < 4; i++)    // elements are indexed from 0 to 3
           a[i] = 0; 
        //----------------------------------------------------------------------
        
        //list example code
        
         List<Integer> l1 = new ArrayList<>(); 
        l1.add(0, 1);  // adds 1 at 0 index 
        l1.add(1, 2);  // adds 2 at 1 index 
        System.out.println(l1);  // [1, 2] 
        //----------------------------------------------------------------------
        
        //set example code
        Set mySet1 = new HashSet();
        // We add a few elements
        mySet1.add("A");
        mySet1.add("C");
        mySet1.add("A");
        mySet1.add("B");
        //----------------------------------------------------------------------
        
        //NavigableSet example code
        NavigableSet original = new TreeSet();
        original.add("1");
        original.add("2");
        original.add("3");
        //----------------------------------------------------------------------
        
        //NavigableMap
        
        NavigableMap<String, Integer> nm = 
                          new TreeMap<String, Integer>(); 
        nm.put("C", 888); 
        nm.put("Y", 999); 
        nm.put("A", 444); 
        nm.put("T", 555); 
        nm.put("B", 666); 
        nm.put("A", 555); 
  
        System.out.println( nm.descendingKeySet()); 
        
    }
}
