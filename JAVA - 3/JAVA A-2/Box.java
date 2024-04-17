class Box{
	int w;
	int l;
	int h;
	int weight;
	
	Box() {
		this.w = 2;
		this.l = 3;
		this.h = 5;
	}
	Box (int width ,int length ,int heigth) {
		this.w = width;
		this.l = length;
		this.h = heigth;
	}
	Box (int width ,int length ,int heigth ,int weight) {
		this.w = width;
		this.l = length;
		this.h = heigth;
		this.weight = weight;
	}
	public void display() {
		System.out.println("width:"+w);
		System.out.println("length:"+l);
		System.out.println("heigth:"+h);
		System.out.println("weight:"+weight);
	}
	
	public static void main(String args[]) {
		Box box1 = new Box(1,3,6);
		box1.display();
	}
}