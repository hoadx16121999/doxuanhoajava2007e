package t3h.java2007.BaiTapDieuKhienVongLap;

import java.util.Scanner;

public class PTBacNhat {

	public static void main(String[] args) {
		int a, b;
		double nghiem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem!");
			} else {
				System.out.println("Phuong trinh vo nghiem!");
			}	
		}
		else {
			nghiem = (double) -b / a;
			System.out.println("Phuong trinh co nghiem x = " + nghiem);
		}
	}
}
