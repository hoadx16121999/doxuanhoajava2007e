package t3h.java2007.BaiTapDieuKhienVongLap;

public class ChiaHet {
	public static void main(String[] args) {
		System.out.println("Cac so chia het cho 7 nhung ko chia het cho 5 tu 20 -200 la: ");
		for(int i = 20; i <= 200; i++) {
			if(i%7 == 0 && i%5 != 0) {
				System.out.print(" " + i);
			}
		}
	}
}
