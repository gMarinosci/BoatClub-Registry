package model.domain;

/**
 * Represents a boat that can be registered and owned by a member.
 */
public class Boat {

  private String boatType;
  private int length;

  /**
   * Creates a new boat object with boatType and length.
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