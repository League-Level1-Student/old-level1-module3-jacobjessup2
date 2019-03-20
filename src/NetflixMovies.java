
public class NetflixMovies {

	public static void main(String[] args) {
		NetflixQueue net = new NetflixQueue();
		
		Movie mov1 = new Movie("Kingdom Hearts 3", 4);
		Movie mov2 = new Movie("Final Fantasy X", 3);
		Movie mov3 = new Movie("Super Smash Bros. Ultimate", 5);
		Movie mov4 = new Movie("Wii Sports Resort", 20);
		Movie mov5 = new Movie("Forkknife", -1);
		Movie mov6 = new Movie("Roblox", 40);
		Movie mov7 = new Movie("Cool Math Games", 200);
		
		System.out.println(mov5.getTicketPrice());
		
		
		net.addMovie(mov1);
		net.addMovie(mov2);
		net.addMovie(mov3);
		net.addMovie(mov4);
		net.addMovie(mov5);
		net.addMovie(mov6);
		net.addMovie(mov7);
		
		net.printMovies();
		System.out.println("The best movie is " + net.getBestMovie());
		System.out.println("The second best movie is " + net.getMovie(1));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
