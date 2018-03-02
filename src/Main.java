import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int R, C, F, N, B, T;
	static int time;
	static ArrayList<Car> cars;
	static LinkedList<Ride> rides;
	static int average = 0;


	public static void main(String[] args) throws FileNotFoundException {
		cars = new ArrayList<Car>();
		rides = new LinkedList<Ride>();
		input();
		for(time = 0; time < T; time+=average){
			for(int i = 0; i < cars.size(); i++){
				Car c = cars.get(i);
				if(c.isAvailable()){
					int maxPoints = 0;
					Ride bestRide = null;
					for(int j = 0; j < rides.size(); j++){
						Ride r = rides.get(j);
						int distance = Math.abs(r.getStartColumn() - c.getX()) + Math.abs(r.getStartRow() - c.getY());
						if(r.getEarliestStart() - time <= distance){
							int points = B + distance;
							if(points > maxPoints){
								maxPoints = points;
								bestRide = r;
							}
						}
					}
					if(bestRide != null){
						c.assignRide(bestRide);
						rides.remove(bestRide);
					}
				}

				if(!c.isAvailable())
					c.drive(average);
			}
		}
		output();
	}

	public static void input() throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		F = sc.nextInt();
		N = sc.nextInt();
		B = sc.nextInt();
		T = sc.nextInt();

		int sum = 0;
		rides = new LinkedList<Ride>();
		for(int i = 0; i < N; i++){
			Ride r = new Ride(i, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			rides.add(r);
			sum += r.getDistance();

		}

		for(int i = 0; i < F; i++){
			cars.add(new Car(0, 0));
		}

		average = sum/rides.size();
		//System.out.println("average: " + average);
	}


	public static void output() {
		for(int i = 0; i < F; i++){
			Car c = cars.get(i);
			ArrayList<Ride> ridesDriven = c.getRidesDriven();
			int size = ridesDriven.size();
			System.out.print(size);
			for(int j = 0; j < ridesDriven.size(); j++){
				Ride r = ridesDriven.get(j);
				System.out.print(" " + r.getRideID());
			}
			System.out.println();
		}
	}
}
