package org.example.collections.comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {

	public static void sort(){
		List<Movie> movies= new ArrayList<>();
		movies.add(new Movie("hero",2));
		movies.add(new Movie("bad guy",5));

		movies.stream()
				.sorted(Comparator.comparingInt(Movie::getLikes))
				.forEach((movie -> System.out.println(movie.getTitle())));
	}

	public static void transform(){
		List<Movie> movies= new ArrayList<>();
		movies.add(new Movie("hero",2));
		movies.add(new Movie("bad guy",5));
		movies.add(new Movie("girl",50));

		movies.stream()
				.filter(m->m.getLikes()>10)
				.map(m->m.getTitle().toUpperCase())
				.forEach(System.out::println);



	}

}
