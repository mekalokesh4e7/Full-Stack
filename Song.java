package exam;
import java.util.*;
public class Song {
	private String Title;
	private String artist;
	Song(String Title,String artist){
		this.Title=Title;
		this.artist=artist;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String toString() {
		return "Song [Title=" + Title + ", artist=" + artist + "]";
	}
	
}
