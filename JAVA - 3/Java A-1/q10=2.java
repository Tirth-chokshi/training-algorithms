class Pattern2 {
	public static void main(String args[]) {
		int n=5;
		int k=1;
		for (int i =0;i<=n;i++) {
			for (int j=1; j<=i;j++) {
				System.out.printf(i+" ");
				k++;
			}
			System.out.printf("\n");
		}
	}
}