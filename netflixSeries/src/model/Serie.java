package model;

public class Serie {
	
	
	 
	public String majorGenre;
	public String title;
	private String subgenre;
	public int premiereYear;
	public String episodes;
	public String status;
	public int imdbRating;
	
	public Serie(String majorGenre, String title, String subgenre, int premiereYear, 
			String episodes, String status, int imdbRating) {
		super();
		this.majorGenre = majorGenre;
		this.title = title;
		this.subgenre = subgenre;
		this.premiereYear = premiereYear;
		this.episodes = episodes;
		this.status = status;
		this.imdbRating = imdbRating;
	}
	
	@Override
	public String toString() {
		return majorGenre+";"+title+";"+subgenre+";"+premiereYear+";"+episodes+";"+imdbRating;
	}
}
