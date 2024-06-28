package exam;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MusicLibrary ob1=new MusicLibrary();
		char ch;
		do {
			System.out.println("Enter the details:"+'\n'+"1.View Songs"+'\n'+"2.add Song"+'\n'+"2.remove song");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				ob1.ViewSongs();
				break;
			case 2:
				ob1.addsong();
				break;
			case 3:
				ob1.removeSong();
				break;
				default:
					System.out.println("enter valid num");
					break;
		}
			System.out.println("enter y to start again ");
			ch=sc.next().charAt(0);
			
		}while(ch=='y');
	}
		
	}

