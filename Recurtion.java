package withoutloop;

public class Recurtion {

	public static void main(String[] args) {
		Recurtion obj = new Recurtion();
		int b = obj.add(5);
		System.out.println("factorial number =" + b + "\n");
		System.out.println("------1 to 10 natural number------" + "\n");
		obj.natural(1);
		System.out.println("------1 to 10 odd number-------" + "\n");
		obj.odd(1);
		System.out.println("-------2 to 10 even number------" + "\n");
		obj.even(2);
		System.out.println("--------reverse number--------");
		obj.reverse(123, 0);
		obj.reverse(4353, 0);
		System.out.println("----- digit number --------");
		obj.digit(12763, 0, 0);
		System.out.println("----- digit total number --------");
		obj.digittotal(1232, 0);
	}

	public int add(int n) {
		if (n == 1) {
			return 1;
		}
		{
			return (n * add(n - 1));
		}
	}

	public int natural(int i) {
		if (i == 11) {
			return i;
		}
		System.out.println(i);
		return natural(i + 1);
	}

	public int odd(int i) {
		if (i == 11) {
			return i;
		}
		System.out.println(i);
		return odd(i + 2);
	}

	public int even(int i) {
		if (i == 12) {
			return i;
		}
		System.out.println(i);
		return even(i + 2);
	}

	public int reverse(int n, int rever) {
		if (n == 0) {
			System.out.println("reverse number = " + rever + "\n");
			return n;

		}

		int num = n % 10;
		return reverse(n / 10, rever * 10 + num);
	}

	public int digit(int n, int count, int num) {
		if (n == 0) {
			System.out.println(" digit number =" + count + "\n");
			return n;
		}
		num = n % 10;
		return digit(n / 10, count + 1, num);
	}

	public int digittotal(int n, int rever) {
		if (n == 0) {
			System.out.println("digit total number = " + rever + "\n");
			return n;

		}

		int num = n % 10;
		return digittotal(n / 10, rever + num);
	}
}
