class Main {
	public static void main(String[] args) {
		System.out.println((new Simple()).Start(1, 2));
	}
}

class Trivial {
	int f;

}

class Simple extends Trivial {
	int Start(int a, int b) {
		int x;
		int y;
		x = a;
		y = (b) + (3);
		return 0;
	}

}

