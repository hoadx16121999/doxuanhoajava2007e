package t3h.java2007.BaiTapDieuKhienVongLap;

import java.util.Scanner;

public class PTBacHai {
	public static void main(String[] args) {
		int a, b, c;
		double delta, nghiem1, nghiem2;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		System.out.println("Nhap c: ");
		c = sc.nextInt();
		
		delta = b*b - 4*a*c;
		if(delta < 0) {
			System.out.println("Phuong trinh vo nghiem!");
		}
		else if (delta == 0) {
			nghiem1 = nghiem2 = -b/(2*a);
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + nghiem1);
		}
		else {
			nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
            nghiem2 = (-b - Math.sqrt(delta)) / (2 * a); 
            System.out.println("Phuong trinh co 2 nghiem phan biet la: " + "x1 = " + nghiem1 + " va x2 = " + nghiem2);
		}
	}
}
