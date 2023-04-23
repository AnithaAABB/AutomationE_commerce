public interface Interface1 {
	int sum(int a, int b);

	int sub(int x, int y);

	int mul(int m, int n);

}

public class interface2 implements Interface1 {
	public int sum(int a, int b) {

		int res = a + b;
		return res;
	}

	public int sub(int x, int y) {
		int res1 = x - y;
		return res1;
	}

	public int mul(int m, int n) {
		int res2 = m * n;
		return res2;

	}

	public static void main(String[] args) {
		interface2 var = new interface2();

		int res11 = var.sum(10, 20);
		System.out.println(res11);

		int res22 = var.sub(100, 200);
		System.out.println(res22);

		int res33 = var.mul(20, 30);
		System.out.println(res33);


	}

}
