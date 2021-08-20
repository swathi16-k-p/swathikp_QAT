package JavaTest;


import java.util.*;

public class ReversingString {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the string size : ");
		int l = sc.nextInt();
		for(int i=0;i<l;i++) {
			arr1.add(sc.next());
		}
		System.out.println("Reversed Strings is : ");
		for(int j=arr1.size()-1;j>=0;j--) {
			System.out.println(arr1.get(j));
		}

	}


}
