import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Location lo = new Location(5, 5);
		world.show();
		world.add(lo, bug);
		Bug bug2 = new Bug();
		Location loc = new Location(4,2);
		world.add(loc, bug2);
		bug2.setColor(Color.blue);
		bug2.setDirection(90);
		Flower flower = new Flower();
		Location l = new Location(4,3);
		Location ll = new Location(4,1);
		world.add(l, flower);
		world.add(ll, flower);
		for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
				Location n = new Location(i, j);
				Flower flo = new Flower();
				if(i%2==0) {
					flo.setColor(Color.red);
				}
				else {
					flo.setColor(Color.WHITE);
				}
				world.add(n, flo);
			}
		}
		
	}
}
