package Chap03;
import java.util.*;

public class No01Gogodan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i<=9; i++){
			System.out.println(N+" * "+i+" = "+N*i);
		}
		
	}

}
