package t3h.java2007.BaiTapDieuKhienVongLap;

import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		int n, giaithua = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			giaithua = giaithua * i;
		}
		System.out.println(n + "! = " + giaithua);
	}
}
