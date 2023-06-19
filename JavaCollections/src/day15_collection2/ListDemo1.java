package day15_collection2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// List of Premitive datatypes
		
		ExpCandidates pragna = new ExpCandidates(1, "Pragna");
		ExpCandidates Rajesh = new ExpCandidates(2, "Rajesh");
		ExpCandidates Pranu = new ExpCandidates(3, "Pranu");
		ExpCandidates Nandu = new ExpCandidates(4, "Nandu");
		ExpCandidates Munny = new ExpCandidates(5, "Munny");
		
		
		//ArrayList<ExpCandidates> l1 = new ArrayList<>();
		List<ExpCandidates> l1 = new ArrayList<>();
		l1.add(pragna);
		l1.add(Rajesh);
		l1.add(Nandu);
		l1.add(Munny);
		l1.add(Pranu);
		
		System.out.println(l1.get(2).exp);
		System.out.println(l1.get(2).name);
		
		ExpCandidates can1 = l1.get(3);
		System.out.println(can1.exp);
		System.out.println(can1.name);
		

	}

}
