package hack_contest_6;

import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		find(arr, 0, m);

	}

	public static void find(int[] arr, int idx, int target) {
		
		if(idx==arr.length) {
			return;
		}
		if(target==arr[idx]) {
			System.out.print(idx+" ");
		}
		find(arr, ++idx, target);
	}

}
