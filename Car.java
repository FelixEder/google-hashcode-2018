
public class Car {
  private int x, y;
  private int distanceToStart, distanceToEnd;
  private Ride currentRide;
  private ArrayList<Ride> ridesDriven;
  private boolean pickedUp;

  public Car(int x, int y) {
    this.x = x;
    this.y = y;
    currentRide = null;
    ridesDriven = new ArrayList<Ride>();
  }

  public void assignRide(Ride ride){
    currentRide = ride;
    distanceToStart = Math.abs(x - currentRide.getStartRow()) + Math.abs(y - currentRide.getStartColumn());
    distanceToEnd = Math.abs(x - currentRide.getFinishRow()) + Math.abs(y - currentRide.getFinishColumn());
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
    if(pickedUp) {
      distanceToEnd--;
      if (distanceToEnd == 0) {
        ridesDriven.add(currentRide);
        x = currentRide.getFinishRow();
        y = currentRide.getFinishColumn();
        currentRide = null;
      }
    } else {
      if(distanceToStart == 0) {
        if(Main.time >= currentRide.getEarliestStart()) {
          pickedUp = true;
          drive();
        }
      } else {
        distanceToStart--;
      }
    }
  }
}
