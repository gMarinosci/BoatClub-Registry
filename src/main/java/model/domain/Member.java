package model.domain;

import com.sun.org.apache.xpath.internal.objects.XString;
import java.util.ArrayList;
import java.util.Random;

public class Member {

  private String memberId;
  private int personalNumber;
  private String firstName;
  private String lastName;
  private ArrayList<Boat> registeredBoats;

  public Member(String firstName, String lastName, int personalNumber) {
    this.personalNumber = personalNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.memberId = generateId();
    this.registeredBoats = new ArrayList<>();
  }

  private String generateId() {
    Random rnd = new Random();
    String alhpaNumeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      sb = sb.append(alhpaNumeric.charAt(rnd.nextInt(alhpaNumeric.length())));
    }
    return sb.toString();

  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getMemberId() {
    return this.memberId;
  }

  public int getPersonalNumber() {
    return this.personalNumber;
  }

  public int getNumberOfBoats() {
    return this.registeredBoats.size();
  }

  public void addNewBoat(Boat boat) {
    this.registeredBoats.add(boat);
  }

<<<<<<< Updated upstream
  public String getInformationAboutRegistredBoats() {
=======
  public void deleteSpecificBoat(Boat boat){ this.registeredBoats.remove(boat);}

  public String getInformationAboutRegistredBoats(){
>>>>>>> Stashed changes
    String information = "";
    for(int i = 0; i < this.registeredBoats.size(); i++) {
      information = information + this.registeredBoats.get(i).getBoatType()
              + " " + this.registeredBoats.get(i).getLength() + " ";
    }
    return information;
  }

  public Boat getSpecificBoat(String boatType, int length){
    Boat boat = this.registeredBoats.get(0);
    for (int i = 0; i < this.registeredBoats.size(); i++) {
      if (this.registeredBoats.get(i).getBoatType().equals(boatType) && this.registeredBoats.get(i).getLength() == length)
        boat = this.registeredBoats.get(i);
    }
    return boat;
  }
}
