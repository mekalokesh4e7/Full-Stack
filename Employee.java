
public class Employee {
	int ID;
	String Name;
	String Password;
	Employee(int a,String b,String c){
		this.ID=a;
		this.Name=b;
		this.Password=c;
	}
	
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + "]";
	}

	public void SetName(String Name) {
		this.Name=Name;
	}
}
