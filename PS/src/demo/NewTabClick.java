package demo;

import java.util.HashMap;

public class NewTabClick {

	public static void main(String[] args) {
		
		
//		String s = "apple,apple,apple,orange,orange,mango";
//		
//		String[] s1 = s.split(",");
//		
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		
//		for(int i = 0;i<s1.length;i++) {
//			if(!hm.containsKey(s1[i])) {
//				hm.put(s1[i], 1);
//			}
//			else {
//				hm.put(s1[i], hm.get(s1[i])+1);
//			}
//		}
//		int max = hm.get(1);
//		for(String i:hm.keySet()) {
//			
//			if(max<hm.get(i)) {
//				max = hm.get(i);
//			}
//		}
		//System.out.println(max);
		
//		int i = 3,m=4,n=5;
//		
//		int result = i>m?(i>n?i:n):(m>n?m:n);
//		
//		System.out.println(result);
		
		int[] arr = {10,20,0,54,78,0};
		
		for(int i = 0;i<arr.length;i++) {
			int min = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				if(min > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
