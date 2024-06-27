import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService  d= new EmployeeService() ;
		Scanner sc=new Scanner(System.in);
		d.PasswordValidation();
		if(d.count20==true) {
			
		System.out.println("Enter the choice from the given index"+'\n'+" 1.ViewDetails"+'\n'+"2.SearchId"+'\n'+"3.removeEmployee"+'\n'+"4.UPdateDetails");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("ViewDetails");
			d.ViewDetails();
			break;
			
		case 2:
			System.out.println("SearchId");
			d.SearchId();
			break;
		
		case 3:
			System.out.println("removeEmployee");
			d.removeEmployee();
			break;
			
		case 4:
			System.out.println("UPdateDetails");
			d.UPdateDetails();
			break;
			
			default:
				System.out.println("Enter valid choice");
				break;
		}
		}
		
	}

}
