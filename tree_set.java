import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("consistency");
		t.add("is");
		t.add("the");
		t.add("key");
		t.add("of");
		t.add("success");
		System.out.println(t);
		TreeSet<Integer> t1 = new TreeSet<Integer>();
// 		treeset print item inn sorted order 
		t1.add(7);
		t1.add(54);
		t1.add(56);
		t1.add(12);
		t1.add(32);
		t1.add(23);
		System.out.println(t1);
		
// 		treeset contain the element or not
		System.out.println(t.contains("consistency"));
// 		remove element from treeset 
        t.remove("the");
        // traversing tree set using for each loop
        for(String x:t){
            System.out.print(x+" ");
        }
        System.out.println();
        // print value smaller than given value
        System.out.println(t1.lower(12));
        // print value greater than given value
        System.out.println(t1.higher(12));
        // value<= object element
        System.out.println(t1.floor(12));
        // value>=object element
        System.out.println(t1.ceiling(12));
        
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.headSet(12));
        System.out.println(t1.tailSet(12));
	}
}
