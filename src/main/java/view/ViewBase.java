package view;

import model.domain.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public abstract class ViewBase implements View{

  Scanner in = new Scanner(System.in, "UTF-8");

  /**
   * Takes user input for the first name of a member.
   */
  public String promptMemberName() {
    String name;
    name = in.next();
    return name;
  }

  /**
   * Takes user input for the last name of a member.
   */
  public String promptMemberLastName() {
    String lastname;
    lastname = in.next();
    return lastname;
  }

  /**
   * Takes user input for the personal number of a member.
   */
  public int promptMemberPersonalNumber() {
    int personalNumber;
    personalNumber = in.nextInt();
    return personalNumber;
  }

  /**
   * Takes user input for the member ID.
   */
  public String promptMemberId() {
    String id;
    id = in.next();
    return id;
  }

  /**
   * Takes user input for boat type.
   */
  public String promptBoatType() {
    return in.next();
  }

  /**
   * Takes user input for boat length.
   */
  public int promptBoatLength() {
    return in.nextInt();
  }

  /**
   * User input for boat name.
   */
  public String promptBoatName() {
    return in.next();
  }





  /**
   * Displays all information of a specific member.
   */
  public void showSpecificMemberInfo(Member member) {
    System.out.println(member.getFirstName() + " "
            + member.getLastName() + " "
            + member.getPersonalNumber() + " "
            + member.getMemberId() + " "
            + member.getInformationAboutRegisteredBoats());
  }

  public void showInformationAboutRegisteredBoats(Member member) {
    System.out.println(member.getInformationAboutRegisteredBoats());
  }

  /**
   * Handles user input.
   */
  public int getInput() {
    try {
      int c = System.in.read();
      while (c == '\r' || c == '\n') {
        c = System.in.read();
      }
      return c;
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return 0;
    }
  }
}
