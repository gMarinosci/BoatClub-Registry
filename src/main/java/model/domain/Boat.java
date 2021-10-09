package model.domain;

public class Boat {

  private String boatType;
  private int length;

  public Boat (String boatType, int length) {

    this.boatType = boatType;
    this.length = length;
  }

  public String getBoatType() {
    return this.boatType;
  }

  public int getLength() {
    return this.length;
  }
}