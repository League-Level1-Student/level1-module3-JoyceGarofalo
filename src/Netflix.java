
public class Netflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("The Lion King", 3);
		Movie movie2 = new Movie("The Matrix", 5);
		Movie movie3 = new Movie("The Lego Movie", 2);
		Movie movie4 = new Movie("Mulan", 4);
		Movie movie5 = new Movie("Wonder Woman", 3);
		movie1.getTicketPrice();
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("the best movie is " + queue.getBestMovie());
		queue.sortMoviesByRating();
		System.out.println("the second best movie is " + queue.getMovie(1));
		
	}
}
