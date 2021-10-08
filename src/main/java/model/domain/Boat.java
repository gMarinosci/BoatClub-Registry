package model.domain;

public class Boat {

  private BoatType boatType;
  private int length;

  public Boat (BoatType boatType, int length) {

    this.boatType = boatType;
    this.length = length;
  }

  public BoatType getBoatType() {
    return this.boatType;
  }

  public int getLength() {
    return this.length;
  }
}