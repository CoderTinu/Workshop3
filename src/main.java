import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("User Registration");
		validation v= new validation();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String fname=sc.next();
		v.nameValidation(fname);
		
		System.out.println("Enter phone Number");
		String phone=sc.next();
		v.nameValidation(phone);
		
	}

}
