package t3h.java2007.BaiTapDieuKhienVongLap;

import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		n = sc.nextInt();
		System.out.println("Cac so nguyen to nho hon " + n + " : ");
		if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (kiemTraNguyenTo(i)) {
                System.out.print(" " + i);
            }
        }
	}
	public static boolean kiemTraNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
