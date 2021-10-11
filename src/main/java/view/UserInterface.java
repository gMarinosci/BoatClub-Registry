package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.domain.Member;

/**
 * UserInterface mostly prints to the console and provides input.
 */
public class UserInterface {
  Scanner in = new Scanner(System.in);

  public void mainMenu() {
    System.out.println("Welcome home buddy");
  }

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
    String boatType;
    boatType = in.next();
    return boatType;
  }

  /**
   * Takes user input for boat length.
   */
  public int promptBoatLength() {
    int length;
    length = in.nextInt();
    return length;
  }

  /**
   * Displays detailed information of all members.
   */
  public void showMemberListVerbose(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " "
              + member.getLastName() + " "
              + member.getPersonalNumber() + " "
              + member.getMemberId() + " "
              + member.getInformationAboutRegisteredBoats());
    }
  }

  /**
   * Displays only the first name, the last name, the member ID and the number of registered boats
   * of a specific member.
   */
  public void showMemberListCompact(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " "
              + member.getLastName() + " "
              + member.getMemberId() + " "
              + member.getNumberOfBoats());
    }
  }

  /**
   * Displays all information of a specific member.
   */
  public void showSpecificMemberInfo(Member member) {
    System.out.println(member.getFirstName()
            + member.getLastName() + " "
            + member.getPersonalNumber() + " "
            + member.getMemberId() + " "
            + member.getInformationAboutRegisteredBoats());
  }

  public void showInformationAboutRegisteredBoats(Member member) {
    System.out.println(member.getInformationAboutRegisteredBoats());
  }


  public void provideMemberFirstName() {
    System.out.print("Enter member first name: ");
  }

  public void provideMemberLastName() {
    System.out.print("Enter member last name: ");
  }

  public void provideMemberPersonalNumber() {
    System.out.print("Enter member personal number: ");
  }

  public void provideMemberId() {
    System.out.print("Enter member ID: ");
  }

  public void provideBoatType() {
    System.out.print("Enter boat type: ");
  }

  public void provideBoatLength() {
    System.out.print("Enter boat length: ");
  }

  public void provideNewBoatType() {
    System.out.print("Enter new boat type: ");
  }

  public void provideNewBoatLength() {
    System.out.print("Enter new boat length: ");
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

  public void quitMessage() {
    System.out.println("Press any key to return to main menu or 'q' to quit.");
  }
}
