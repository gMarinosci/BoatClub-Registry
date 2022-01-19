package view;

import model.domain.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SwedishView extends ViewBase{
  Scanner in = new Scanner(System.in, "UTF-8");

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

  public MenuAction menuSelection() {

    int input = getInput();

    switch (input) {

      case 'a':
        return MenuAction.VerboseList;

      case 'b':
        return MenuAction.CompactList;

      case 'c':
        return MenuAction.NewBoat;

      case 'd':
        return MenuAction.DeleteBoat;

      case 'e':
        return MenuAction.ChangeBoatInfo;

      case 'f':
        return MenuAction.ShowMemberInfo;

      case 'g':
        return MenuAction.AddMember;

      case 'h':
        return MenuAction.DeleteMember;

      case 'i':
        return MenuAction.ChangeMemberInfo;

      default:
        break;
    }

    return null;
  }

    /**
     * Displays detailed information of all members.
     */
  public void showMemberListVerbose(ArrayList< Member > memberList) {
    Comparator<Member> compareByName = (Member o1, Member o2) -> o1.getFirstName().compareTo(o2.getFirstName());

    Collections.sort(memberList, compareByName);

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
    Comparator<Member> compareByName = (Member o1, Member o2) -> o1.getFirstName().compareTo(o2.getFirstName());

    Collections.sort(memberList, compareByName);

    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " "
              + member.getLastName() + " "
              + member.getMemberId() + " "
              + member.getNumberOfBoats());
    }
  }
}
