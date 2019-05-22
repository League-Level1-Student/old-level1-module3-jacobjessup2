import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {

	static Random rand = new Random();

public static void main(String[] args) {
	World w = new World();
	w.show();
	
	
	
	
	for (int i = 0; i < 1000; i++) {
		Location flowall = new Location (rand.nextInt(10),rand.nextInt(10));
		Flower flow = new Flower();
		w.add(flowall, flow);
	}
	
	
	
	Location bug1L = new Location(1,5);
	Bug bug1 = new Bug();
	w.add(bug1L, bug1);
	
	
	
	int randrow = rand.nextInt(10);
	int randcolumn = rand.nextInt(10);
	
	
	Location bug2L = new Location(randrow,randcolumn);
	Bug bug2 = new Bug();
	bug2.setColor(Color.BLUE);
	bug2.turn();
	bug2.turn();
	w.add(bug2L, bug2);
	
	
	
	Location flow1L = new Location(randrow,randcolumn+1);
	Flower flow1 = new Flower();
	w.add(flow1L, flow1);
	
	Location flow2L = new Location(randrow,randcolumn-1);
	Flower flow2 = new Flower();
	w.add(flow2L, flow2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
}
