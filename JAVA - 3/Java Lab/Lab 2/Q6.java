import java.io.File;

class Q6{
	public static void main(String args[]) {
		File remove = new File();
		if (remove.delete()){
			System.out.println("File deleted succesfully");
		}
	}
}