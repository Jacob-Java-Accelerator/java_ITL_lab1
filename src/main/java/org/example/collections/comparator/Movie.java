package org.example.collections.comparator;

import java.util.Comparator;

public class Movie implements Comparator<Movie>{
	private String title;
	private int likes;

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", likes=" + likes +
				'}';
	}

	public Movie(String title, int likes) {
		this.title = title;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		return 0;
	}
}
