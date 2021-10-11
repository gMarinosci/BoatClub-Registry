package model.domain;

import com.sun.org.apache.xpath.internal.objects.XString;
import java.util.ArrayList;
import java.util.Random;

/**
 * Creates new member object.
 */
public class Member {

  private String memberId;
  private int personalNumber;
  private String firstName;
  private String lastName;
  private ArrayList<Boat> registeredBoats;

  /**
   * All necessary information about each member according to the requirements.
   * That includes:
   * their first name, last name, personal number, member ID and all the boats that are registered for the member.
   * The member ID is randomly generated.
   */
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

  public void deleteSpecificBoat(Boat boat) {
    this.registeredBoats.remove(boat);
  }

  public void changeSpecificBoatInfo(Boat boat, String boatType, int length) {
    boat.changeInformation(boatType, length);
  }

  /**
   * Returns information of all registered boats by all members.
   */
  public String getInformationAboutRegisteredBoats() {
    String information = "";
    for (int i = 0; i < this.registeredBoats.size(); i++) {
      information = information + this.registeredBoats.get(i).getBoatType()
              + " " + this.registeredBoats.get(i).getLength() + " ";
    }
    return information;
  }

  /**
   * Finds at what spot in the all registered boat list a specific boat is.
   */
  public Boat getSpecificBoat(String boatType, int length) {
    int i = 0;
    for (i = 0; i < this.registeredBoats.size(); i++) {
      if (this.registeredBoats.get(i).getBoatType().equals(boatType)
              && this.registeredBoats.get(i).getLength() == length) {
        break;
      }
    }
    return this.registeredBoats.get(i);
  }

  /**
   * Provides functionality to change a member's information.
   */
  public void changePersonalInformation(String firstName, String lastName, int personalNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.personalNumber = personalNumber;
  }
}
