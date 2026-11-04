package CoreJava;
import java.util.Scanner;

public class InputInJava_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter you name");
        String name=sc.next();//until space(sc.nextLine() for full name).
        System.out.print(name);
        
	}

}
