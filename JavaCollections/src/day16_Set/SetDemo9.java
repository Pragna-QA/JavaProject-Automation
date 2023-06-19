package day16_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo9 {

	public static void main(String[] args) {
		
		Set<String> hs1 = new LinkedHashSet<>() ;
		
		hs1.add("SaiPragna");
		hs1.add("Rajesh");
		hs1.add(null);
		hs1.add("Oranges");
		hs1.add("Engineer");
		hs1.add("rajesh");
		hs1.add("Oranges");
		
		System.out.println(hs1);
		
		Iterator<String> itr1 = hs1.iterator();
		
		while(itr1.hasNext())
		{
			String value = itr1.next();
			System.out.println(value);
			
		}
		


	}

}
