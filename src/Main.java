
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Bang cuu chuong");
			for (int i = 1; i < 10; i++) {
				System.out.println("* Bang cuu chuong cua so " + i);
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
			}
		} catch (Exception ex) {
			System.out.print("Please try again");
		}
	}
}
