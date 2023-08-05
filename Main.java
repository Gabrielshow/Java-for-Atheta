public class Main { public static void main(String [] args)
{ class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	void changecadence(int newvalue) { gear = newvalue;}
	void speedup( int increment) { speed = speed + increment ;}
	void applybrakes(int decrement) { speed = speed - decrement;}
	void printstates(){ System.out.println("cadence: " + cadence + "speed: " + speed + "gear: " + gear);
	}
	}
	Bicycle b = new Bicycle();
	b.printstates();}}