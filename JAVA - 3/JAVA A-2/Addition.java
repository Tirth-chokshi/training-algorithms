class Addition{
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		Addition plus = new Addition();
		System.out.println("Addition of two numbers:"+plus.add(1,2));
		System.out.println("Addition of three number:"+plus.add(1,2,3));
	}
}