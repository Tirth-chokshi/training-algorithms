import java.util.*;
class Q11{
	public static void main(String args[]) {
		ArrayList<String> heros = new ArrayList<String>();
		heros.add("IronMan");
		heros.add("BatMan");
		heros.add("Hulk");
		heros.add("Homlander");
		
		Iterator i =heros.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}