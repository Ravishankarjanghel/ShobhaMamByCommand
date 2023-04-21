package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class A extends B{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(20);
		al.add(39);
		al.add(43);
		al.add(50);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
	}
}
