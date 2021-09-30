package model.domain;

public class Boat {

  private BoatType boatType;
  private int length;

  private Boat (BoatType boatType, int length) {

    this.boatType = boatType;
    this.length = length;
  }

  private BoatType getBoatType() {
    return this.boatType;
  }

  private int getLength() {
    return this.length;
  }
}