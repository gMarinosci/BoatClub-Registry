package controller;

import java.util.ArrayList;
import javax.swing.text.View;
import model.domain.Boat;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;

/**
 * Provides functionality of ui menu.
 */
public class User {
  /**
   * Runs the program until the input on the terminal is q.
   * When q is entered the program ends.
   */
  public void run(Menu menu, UserInterface ui, ArrayList<Member> memberList) {

    do {
      ui.mainMenu();
      int c = ui.getInput();
      selection(c, ui, menu, memberList);
      ui.quitMessage();
    } while (ui.getInput() != 'q');
  }

  /**
   * Provides all requirements as menu options.
   */
  public void selection(int n, UserInterface ui, Menu menu, ArrayList<Member> memberList) {

    switch (Character.getNumericValue(n)) {
      case 1:
        //Verbose list
        ui.showMemberListVerbose(memberList);
        break;
      case 2:
        //Compact List
        ui.showMemberListCompact(memberList);
        break;
      case 3:
        //A specific member's information
        ui.provideMemberId();
        String id3 = ui.promptMemberId();
        ui.showSpecificMemberInfo(menu.getSpecificMember(memberList, id3));
        break;
      case 4:
        //Add a new member
        ui.provideMemberFirstName();
        String name4 = ui.promptMemberName();
        ui.provideMemberLastName();
        String lastname4 = ui.promptMemberLastName();
        ui.provideMemberPersonalNumber();
        int personalNumber = ui.promptMemberPersonalNumber();
        menu.addNewMember(memberList, name4, lastname4, personalNumber);
        break;
      case 5:
        //Delete a member
        ui.provideMemberId();
        String id = ui.promptMemberId();
        menu.deleteMember(memberList, id);
        break;
      case 6:
        //Change a member's information
        ui.provideMemberId();
        String id6 = ui.promptMemberId();
        ui.provideMemberFirstName();
        String firstName = ui.promptMemberName();
        ui.provideMemberLastName();
        String lastName = ui.promptMemberLastName();
        ui.provideMemberPersonalNumber();
        int personalNumber6 = ui.promptMemberPersonalNumber();
        menu.changeMemberInformation(menu.getSpecificMember(memberList, id6), firstName, lastName, personalNumber6);
        break;
      case 7:
        //Register a new boat
        ui.provideBoatType();
        String boatType = ui.promptBoatType();
        ui.provideBoatLength();
        int boatLength = ui.promptBoatLength();
        ui.provideMemberId();
        String id7 = ui.promptMemberId();
        menu.registerNewBoat(menu.getSpecificMember(memberList, id7), boatType, boatLength);
        break;

      case 8:
        //Delete a boat
        ui.provideMemberId();
        String id8 = ui.promptMemberId();
        ui.showInformationAboutRegisteredBoats(menu.getSpecificMember(memberList, id8));
        ui.provideBoatType();
        String boatType8 = ui.promptBoatType();
        ui.provideBoatLength();
        int boatLength8 = ui.promptBoatLength();
        menu.deleteBoat(menu.getSpecificMember(memberList, id8),
                menu.getSpecificMember(memberList, id8).getSpecificBoat(boatType8, boatLength8));
        break;

      case 9:
        //Change a boat's information
        ui.provideMemberId();
        String id9 = ui.promptMemberId();
        ui.showInformationAboutRegisteredBoats(menu.getSpecificMember(memberList, id9));
        ui.provideBoatType();
        String boatType9 = ui.promptBoatType();
        ui.provideBoatLength();
        int boatLength9 = ui.promptBoatLength();
        ui.provideNewBoatType();
        String newBoatType = ui.promptBoatType();
        ui.provideNewBoatLength();
        int newBoatLength = ui.promptBoatLength();
        menu.changeBoatInfo(menu.getSpecificMember(memberList, id9),
                menu.getSpecificMember(memberList, id9).getSpecificBoat(boatType9, boatLength9),
                newBoatType, newBoatLength);
        break;
      default:
        System.out.println("Error");
    }
  }
}