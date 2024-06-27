import java.util.*;
public class EmployeeService {
	private static final boolean True = false;
	boolean count20=false;
	int SSNAME;
	ArrayList<Employee> a=new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);
		Employee ob= new Employee(1,"loki","loki0");
		Employee ob1= new Employee(2,"vamsi","vamsi1");
		Employee ob2= new Employee(3,"sailu","sailu3");
		Employee ob3= new Employee(4,"sai","sai4");
		Employee ob4= new Employee(5,"dhruva","dhruva5");
	EmployeeService(){
		a.add(ob);
		a.add(ob1);
		a.add(ob2);
		a.add(ob3);
		a.add(ob4);
		
	}
	void ViewDetails() {
		for(Employee x:a) {
			if(x.ID==SSNAME)
			System.out.println(x);
		}
	}
	void SearchId() {
		System.out.println("Enter Employee Id");
		int SID=sc.nextInt();
		int count=0;
		for(Employee x:a) {
			if(x.ID==SID) {
				System.out.println(x);
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Thank you");
		}
		else {
				System.out.println("details not found");
			}
		
	}
	void removeEmployee() {
		System.out.println("Enter Employee id");
		int SID=sc.nextInt();
		int count=0;
		for(Employee x:a) {
			if(x.ID==SID) {
				a.remove(x);
				count++;
			}
		}
		if(count==1) {
			System.out.println("the details are been removed");
		}
		else {
			System.out.println("the enterd details are not found");
		}
		
	}
	void UPdateDetails() {
		System.out.println("enter the details");
		int SID=sc.nextInt();
		int count=0;
		for(Employee x: a) {
			if(x.ID==SID) {
					System.out.println("Enter the updated details");
					String SNAME=sc.next();
					x.SetName(SNAME);
					break;
				}
			else{
				System.out.println("not valid");
				break;
			}
			
			}
		}
	void PasswordValidation() {
		System.out.println("Enter id:");
		int SID=sc.nextInt();
		SSNAME=SID;
		System.out.println("Enter User name:");
		String SNAME=sc.next();
		System.out.println("Enter password:");
		String SPASSWORD=sc.next();
		for(Employee x:a) {
			if(x.Name.equals(SNAME)&&x.Password.equals(SPASSWORD)&&x.ID==SID) {
					count20=true;
			}
		}
		
	}
	}
