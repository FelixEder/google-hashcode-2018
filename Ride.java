
public class Ride {
  private int rideID;
  private int startRow;
  private int startColumn;
  private int finishRow;
  private int finishColumn;
  private int earliestStart;
  private int latestFinish;
  private int distance;

  public Ride(int rideID, int startRow, int startColumn, int finishRow,
              int finishColumn, int earliestStart, int latestFinish) {
    this.rideID = rideID;
    this.startRow = startRow;
    this.startColumn = startColumn;
    this.finishRow = finishRow;
    this.finishColumn = finishColumn;
    this.earliestStart = earliestStart;
    this.latestFinish = latestFinish;
    distance = Math.abs(startRow - finishRow) + Math.abs(startColumn - finishColumn);
  }

  public int getRideID() {return rideID;}

  public int getStartRow() {return startRow;}

  public int getStartColumn() {return startColumn;}

  public int getFinishRow() {return finishRow;}

  public int getFinishColumn() {return finishColumn;}

  public int getEarliestStart() {return earliestStart;}

  public int getLatestFinish() {return latestFinish;}

  public int getDistance() {return distance;}

}
