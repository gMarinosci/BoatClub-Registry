package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.domain.Member;

/**
 * UserInterface provides input and output.
 */
public class UserInterface {
  Scanner in = new Scanner(System.in);

  /**
   * ui terminal main menu.
   */
  public void mainMenu() {
    System.out.println("***** Menu *****\n"
            + "(1) Display a verbose list of all members\n"
            + "(2) Display a compact list of all members\n"
            + "(3) Change the information of a member\n"
            + "(4) Add a new member\n"
            + "(5) Delete a member\n"
            + "(6) Change a member's information\n"
            + "(7) Register a new boat\n"
            + "(8) Delete a boat\n"
            + "(9) Change a boat's information\n"
            + "\nChoose one of the options by entering a number\n");
  }

  public void choiceOne() {
    System.out.println("\nVerbose List:\n");
  }

  public void choiceTwo() {
    System.out.println("\nCompact List:\n");
  }

  public void choiceThree(String id) {
    System.out.println("\nInformation of member " + id + ":");
  }

  public void choiceFour() {
    System.out.println("\nTo add a new member, please provide the first name, last name,"
            + " and a personal number.");
  }

  public void choiceFourFinished() {
    System.out.println("\n*\t*\t*\tThe new member has been added.\n");
  }

  public void choiceFive() {
    System.out.println("\nTo delete a member, please provide the member ID.");
  }

  public void choiceFiveFinished() {
    System.out.println("\n*\t*\t*\tThe member has been deleted.\n");
  }

  public void choiceSix() {
    System.out.println("\nTo change a member's information, please provide the member's ID"
            + " and enter the new information for first name, last name and personal number.\n");
  }

  public void choiceSixFinished() {
    System.out.println("\n*\t*\t*\tThe member information has been updated.\n");
  }

  public void choiceSeven() {
    System.out.println("\nTo register a new boat, please provide the boat's type, its length"
            + " and the member ID of the member who owns the boat.");
  }

  public void choiceSevenFinished() {
    System.out.println("\n*\t*\t*\tThe new boat has been registered.\n");
  }

  public void choiceEight() {
    System.out.println("\nTo delete a boat, please provide the boat's name.");
  }

  public void choiceEightFinished() {
    System.out.println("\n*\t*\t*\tThe boat has been deleted.\n");
  }

  public void choiceNine() {
    System.out.println("To change a boat's information, please provide the member ID and old boat information first, "
            + "followed by the new boat information");
  }

  public void choiceNineFinished() {
    System.out.println("\n*\t*\t*\tThe boat information has been updated.\n");
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
