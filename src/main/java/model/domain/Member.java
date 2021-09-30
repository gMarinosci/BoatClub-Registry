package model.domain;

import java.util.ArrayList;
import java.util.Random;

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
    Random rnd = new Random();
    String AlhpaNumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 6; i++)
      sb = sb.append(AlhpaNumeric.charAt(rnd.nextInt(AlhpaNumeric.length())));
    return sb.toString();
  }



}
