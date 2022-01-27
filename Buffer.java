import java.io.*;
public class Buffer {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int id; String name; float fees;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id name and fees ");
		id = Integer.parseInt(br.readLine());
		name = br.readLine();
		fees = Float.parseFloat(br.readLine());
		
		System.out.println(+id+" "+name+ " "+fees);
	}

}
