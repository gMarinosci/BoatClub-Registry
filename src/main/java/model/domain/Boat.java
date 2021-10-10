package model.domain;

/**
 * Boat class for Boat objects.
 */
public class Boat {

  private String boatType;
  private int length;

  /**
   *
   * @param boatType
   * @param length
   */
  public Boat(String boatType, int length) {

    this.boatType = boatType;
    this.length = length;
  }

  public String getBoatType() {
    return this.boatType;
  }

  public int getLength() {
    return this.length;
  }


  public void changeInformation(String boatType, int boatLength) {
    this.boatType = boatType;
    this.length = boatLength;
  }
}