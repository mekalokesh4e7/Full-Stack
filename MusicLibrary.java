package exam;
import java.util.*;
public class MusicLibrary {
	Scanner sc=new Scanner(System.in);
	ArrayList<Song> a=new ArrayList<Song>();
	void ViewSongs() {
		System.out.println(a);
	}
	void addsong() {
		System.out.println("enter how many songs you want to add");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("enter song title");
			String s1=sc.next(); 
			System.out.println("enter song");
			String s2=sc.next();
			Song ob5=new Song(s1,s2);
			a.add(ob5);
		}
		
		System.out.println(a);
	}
	void removeSong() {
		String r1=sc.next();
		for(Song x:a) {
			if(x.getTitle().equals(r1)) {
				a.remove(x);
			}
		}
		System.out.println(a);
	}
}
