package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class demoExample {
	public static void main(String[] args) {
		String s = "apple,apple,apple,orange,orange,mango";
		
		String[] s1 = s.split(",");
		
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		
		for(int i = 0;i<s1.length;i++) {
			if(!hm.containsKey(s1[i])) {
				hm.put(s1[i], 1);
			}
			else {
				hm.put(s1[i], hm.get(s1[i])+1);
			}
		}
		System.out.println(hm);
		int max = hm.get("apple");
		for(String i:hm.keySet()) {
			
			if(max<hm.get(i)) {
				max = hm.get(i);
			}
		}
		
	}
}
