
public class Car {
  private int x, y, distance;
  private Ride currentRide;
  private ArrayList<Ride> ridesDriven;

  public Car(int x, int y) {
    this.x = x;
    this.y = y;
    currentRide = null;
    ridesDriven = new ArrayList<Ride>();
  }

  public void assignRide(Ride ride){
    currentRide = ride;
    distance = Math.abs(x - currentRide.getFinishRow()) + Math.abs(y - currentRide.getFinishColumn());
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public Ride getCurrentRide(){
    return currentRide;
  }

  public ArrayList<Ride> getRidesDriven(){
    return ridesDriven;
  }

  public boolean isAvailable(){
    return (currentRide == null);
  }
  public void drive(){
    distance--;
    if (distance == 0) {
      ridesDriven.add(currentRide);
      x = currentRide.getFinishRow();
      y = currentRide.getFinishColumn();
      currentRide = null;
    }
  }
}
