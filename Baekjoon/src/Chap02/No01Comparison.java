package Chap02;
import java.util.*;

public class No01Comparison {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A<B) {
		System.out.println("<");
		}else if(A>B) {
		System.out.println(">");
		}else {
		System.out.println("==");
		}
	}

}
