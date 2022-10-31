import java.util.*;
public class Main{
    public static void main (String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        s1.add(10);
        s1.add(30);
        s1.add(20);
        s1.add(40);
        s2.add(10);
        s2.add(30);
        s2.add(32);
        s2.add(50);
        s2.add(70);
       
        difference(s1,s2);
      
    }
    static void difference(Set<Integer> s1,Set<Integer> s2){
        s2.removeAll(s1);
         System.out.println(s2);
    }
    
}
