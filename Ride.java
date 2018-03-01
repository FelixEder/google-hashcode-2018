
public class Ride {
  private int startRow;
  private int startColumn;
  private int finishRow;
  private int finishColumn;
  private int earliestStart;
  private int latestFinish;

  public Ride(int startRow, int startColumn, int finishRow, int finishColumn,
              int earliestStart, int latestFinish) {
    this.startRow = startRow;
    this.startColumn = startColumn;
    this.finishRow = finishRow;
    this.finishColumn = finishColumn;
    this.earliestStart = earliestStart;
    this.latestFinish = latestFinish;
  }

  public int getStartRow() {return startRow;}

  public int getStartColumn() {return startColumn;}

  public int getFinishRow() {return finishRow;}

  public int getFinishColumn() {return finishColumn;}

  public int getEarliestStart() {return earliestStart;}

  public int getLatestFinish() {return latestFinish;}

}
