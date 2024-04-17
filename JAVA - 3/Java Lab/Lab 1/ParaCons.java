class ParaCons{
	int no;
	String  name;
	
	 ParaCons(int sNo , String sName) {
		this.no = sNo;
		this.name = sName;
	}
	void display () {
		System.out.println("Id: "+ no);
		System.out.println("Name: " + name);
	}
	public static void main(String args[]) {
		ParaCons obj1 = new ParaCons(339,"Tirth");
		ParaCons obj2 = new ParaCons(376,"Krushil");
		
		obj1.display();
		obj2.display();
	}
}