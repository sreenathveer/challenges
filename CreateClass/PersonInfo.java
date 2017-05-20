package CreateClass;
import java.util.Scanner;
public class PersonInfo {
	public static void main(String args){

		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter id");
		p.setId(sc.nextInt());
		System.out.println("Enter name");
		p.setName(sc.nextLine());
		System.out.println("Enter PhoneNumber");
		p.setPhoneNumber(sc.nextLine());
		System.out.println("Enter Address");
		p.setAddress(sc.nextLine());
		
		//display info
		
		System.out.println("id "+p.getId()+"\n"+"name "+p.getName()+"\n"+"Phone Number"+p.getPhoneNumber()+"Addrress "+p.getAddress());
		
		
	}
}
