import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int R, C, F, N, B, T;
	static ArrayList<Car> cars;
	static LinkedList<Ride> rides;

	public static void main(String[] args) throws FileNotFoundException {
		input();
		for(int t = 0; t < T; t++){
			for(int i = 0; i < cars.size(); i++){
				for(int j = 0; j < rides.size(); j++){
					if()
				}
			}
		}
		output();
	}

	public static void input() throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		F = sc.nextInt();
		N = sc.nextInt();
		B = sc.nextInt();
		T = sc.nextInt();

		rides = new LinkedList<Ride>();
		for(int i = 0; i < N; i++){
			rides.add(new Ride(i, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
	}

	public static void output() {
		for(int i = 0; i < F; i++){
			Car c = c.get(i);
			ArrayList<Ride> ridesDriven = c.ridesDriven();
			int size = ridesDriven.size();
			System.out.print(size);
			for(int j = 0; j < ridesDriven.size(); j++){
				System.out.print(" " + ridesDriven.getRideID());
			}
			System.out.println();
		}
	}
}
