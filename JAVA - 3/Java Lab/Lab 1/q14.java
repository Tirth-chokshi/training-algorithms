class q14{
	public static void halfPyramid() {
		for(int i=0;i<=5;i++){
			for (int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		halfPyramid();
	}
}