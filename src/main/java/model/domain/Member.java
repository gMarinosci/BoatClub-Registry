package model.domain;

import java.util.ArrayList;

public class Member {

  private String memberId;
  private int personalNumber;
  private String firstName;
  private String lastName;
  private ArrayList<Boat> registeredBoats;

  private Member (String firstName, String lastName, int personalNumber) {
    this.personalNumber = personalNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.memberId = generateId();
    this.registeredBoats = new ArrayList<>();
  }

  private String generateId() {

  }



}
