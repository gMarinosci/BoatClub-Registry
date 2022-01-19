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
    this.registeredBoats = new ArrayList<>();
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

  public void setId(String id) {
    this.memberId = id;
  }

  public void deleteSpecificBoat(Boat boat) {
    this.registeredBoats.remove(boat);
  }

  public void changeSpecificBoatInfo(Boat boat, String name, String boatType, int length) {
    boat.changeInformation(name, boatType, length);
  }

  /**
   * Returns information of all registered boats by all members.
   */
  public String getInformationAboutRegisteredBoats() {
    StringBuffer buf = new StringBuffer();
    for (int i = 0; i < this.registeredBoats.size(); i++) {
      buf.append(this.registeredBoats.get(i).getName() + " "
              + this.registeredBoats.get(i).getBoatType()
              + " " + this.registeredBoats.get(i).getLength() + " ");
    }
    return buf.toString();
  }

  /**
   * Finds at what spot in the all registered boat list a specific boat is.
   */
  public Boat getSpecificBoat(String name) {
    int i = 0;
    for (i = 0; i < this.registeredBoats.size(); i++) {
      if (this.registeredBoats.get(i).getName().equals(name)) {

        break;
      }
    }
    return this.registeredBoats.get(i);
  }

  public ArrayList<String> getBoatsName(){
    int i = 0;
    ArrayList<String> boatsName = new ArrayList<>();
    for (i = 0; i < this.registeredBoats.size(); i++) {
        boatsName.add(registeredBoats.get(i).getName());
      }
    return boatsName;
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
