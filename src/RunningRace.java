
public class RunningRace {
	

	     static int nextBibNumber;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	RunningRace (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	}

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	RunningRace race1 = new RunningRace("Jim", 10);
	RunningRace race2 = new RunningRace("Jerry", 10);
	
	System.out.println(race1.name);
	System.out.println(race2.name);
	System.out.println(race1.bibNumber);
	System.out.println(race2.bibNumber);
	System.out.println(race1.raceLocation);
	System.out.println(race2.raceLocation);
	} 
}
