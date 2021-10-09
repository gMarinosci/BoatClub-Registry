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

  public Member (String firstName, String lastName, int personalNumber) {
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

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getMemberId(){
    return this.memberId;
  }

  public int getPersonalNumber(){
    return this.personalNumber;
  }

  public int getNumberOfBoats(){
    return this.registeredBoats.size();
  }

  public void addNewBoat(Boat boat){
    this.registeredBoats.add(boat);
  }

  public String getInformationAboutRegistredBoats(){
    String information = "";
    for(int i = 0; i < this.registeredBoats.size(); i++){
      information = information + this.registeredBoats.get(i).getBoatType() + " " + this.registeredBoats.get(i).getLength() + " ";
    }
    return information;

  }
}
