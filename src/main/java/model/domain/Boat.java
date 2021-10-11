package model.domain;

/**
 * Represents a boat that can be registered and owned by a member.
 */
public class Boat {

  private String name;
  private String boatType;
  private int length;

  /**
   * Creates a new boat object with boatType and length.
   */
  public Boat(String name, String boatType, int length) {
    this.name = name;
    this.boatType = boatType;
    this.length = length;
  }

  public String getName() {
    return this.name;
  }

  public String getBoatType() {
    return this.boatType;
  }

  public int getLength() {
    return this.length;
  }

  /**
   * functionality to change the information of a boat
   * as mentioned in requirements of the assignment.
   */
  public void changeInformation(String name, String boatType, int boatLength) {
    this.name = name;
    this.boatType = boatType;
    this.length = boatLength;
  }
}