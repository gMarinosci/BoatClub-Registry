package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.domain.Member;

/**
 * UserInterface provides input and output.
 */
public class EnglishView extends ViewBase{
  Scanner in = new Scanner(System.in, "UTF-8");
  /**
   * ui terminal main menu.
   */

  public void mainMenu() {
    System.out.println("***** Menu *****\n"
            + "(1) Display a verbose list of all members\n"
            + "(2) Display a compact list of all members\n"
            + "(3) Show information of a specific member\n"
            + "(4) Add a new member\n"
            + "(5) Delete a member\n"
            + "(6) Change a member's information\n"
            + "(7) Register a new boat\n"
            + "(8) Delete a boat\n"
            + "(9) Change a boat's information\n"
            + "\nChoose one of the options by entering a number\n");
  }

  public void verboseList() {
    System.out.println("\nVerbose List:\n");
  }

  public void compactList() {
    System.out.println("\nCompact List:\n");
  }

  public void showMemberInfo(String id) {
    System.out.println("\nInformation of member " + id + ":");
  }

  public void newMember() {
    System.out.println("\nTo add a new member, please provide the first name, last name,"
            + " and a personal number.");
  }

  public void memberAdded() {
    System.out.println("\n*\t*\t*\tThe new member has been added.\n");
  }

  public void deleteMember() {
    System.out.println("\nTo delete a member, please provide the member ID.");
  }

  public void memberDeleted() {
    System.out.println("\n*\t*\t*\tThe member has been deleted.\n");
  }

  public void changeMemberInfo() {
    System.out.println("\nTo change a member's information, please provide the member's ID"
            + " and enter the new information for first name, last name and personal number.\n");
  }

  public void memberInfoChanged() {
    System.out.println("\n*\t*\t*\tThe member information has been updated.\n");
  }

  public void newBoat() {
    System.out.println("\nTo register a new boat, please provide the boat's type, its length"
            + " and the member ID of the member who owns the boat.");
  }

  public void boatAdded() {
    System.out.println("\n*\t*\t*\tThe new boat has been registered.\n");
  }

  public void deleteBoat() {
    System.out.println("\nTo delete a boat, please provide the boat's name.");
  }

  public void boatDeleted() {
    System.out.println("\n*\t*\t*\tThe boat has been deleted.\n");
  }

  /**
   * all choice methods display output to the terminal.
   */
  public void changeBoatInfo() {
    System.out.println("To change a boat's information, "
            + "please provide the member ID and the name of the boat you want to change, "
            + "followed by the new boat information");
  }

  public void boatInfoChanged() {
    System.out.println("\n*\t*\t*\tThe boat information has been updated.\n");
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

  public void provideBoatName() {
    System.out.print("Enter boat name: ");
  }

  public void provideBoatType() {
    System.out.print("Enter boat type: ");
  }

  public void provideBoatLength() {
    System.out.print("Enter boat length: ");
  }

  public void provideNewBoatName() {
    System.out.print("Enter new boat name: ");
  }

  public void provideNewBoatType() {
    System.out.print("Enter new boat type: ");
  }

  public void provideNewBoatLength() {
    System.out.print("Enter new boat length: ");
  }

  public void quitMessage() {
    System.out.println("Press any key to return to main menu or 'q' to quit.");
  }
}
