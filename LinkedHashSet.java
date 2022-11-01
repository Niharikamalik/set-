import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(23);
		s.add(34);
		s.add(12);
		s.add(24);
		s.add(5);
		System.out.println(s);
		System.out.println(s.size());
	    s.remove(12);
	    System.out.println(s);
	    System.out.println(s.contains(34));
	}
}
