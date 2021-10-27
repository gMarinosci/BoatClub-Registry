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
      int choice = ui.getInput();
      selection(choice, ui, menu, memberList);
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
        verbose_list(menu, ui, memberList);
        break;
      case 2:
        //Compact List
        compact_list(menu, ui, memberList);
        break;
      case 3:
        //A specific member's information
        show_member_information(menu, ui, memberList);
        break;
      case 4:
        //Add a new member
        add_member(menu, ui, memberList);
        break;
      case 5:
        //Delete a member
        delete_member(menu, ui, memberList);
        break;
      case 6:
        //Change a member's information
        change_member_information(menu, ui, memberList);
        break;
      case 7:
        //Register a new boat
       register_new_boat(menu, ui, memberList);
        break;

      case 8:
        //Delete a boat
        delete_boat(menu, ui, memberList);
        break;

      case 9:
        //Change a boat's information
        change_boat_info(menu, ui, memberList);
        break;
      default:
        System.out.println("Error");
    }
  }
  public void verbose_list(Menu menu, UserInterface ui, ArrayList<Member> memberList){
    ui.choiceOne();
    ui.showMemberListVerbose(memberList);
  }

  public void compact_list(Menu menu, UserInterface ui, ArrayList<Member> memberList){
    ui.choiceTwo();
    ui.showMemberListCompact(memberList);
  }

  public void show_member_information(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.provideMemberId();
    String id3 = ui.promptMemberId();
    ui.choiceThree(id3);
    ui.showSpecificMemberInfo(menu.getSpecificMember(memberList, id3));
  }

  public void add_member(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceFour();
    ui.provideMemberFirstName();
    String name4 = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastname4 = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber = ui.promptMemberPersonalNumber();
    menu.addNewMember(memberList, name4, lastname4, personalNumber);
    ui.choiceFourFinished();
  }

  public void delete_member(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceFive();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    menu.deleteMember(memberList, id);
    ui.choiceFiveFinished();
  }

  public void change_member_information(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceSix();
    ui.provideMemberId();
    String id6 = ui.promptMemberId();
    ui.provideMemberFirstName();
    String firstName = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastName = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber6 = ui.promptMemberPersonalNumber();
    menu.changeMemberInformation(menu.getSpecificMember(memberList, id6), firstName, lastName, personalNumber6);
    ui.choiceSixFinished();
  }

  public void register_new_boat(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceSeven();
    ui.provideBoatName();
    String name = ui.promptBoatName();
    ui.provideBoatType();
    String boatType = ui.promptBoatType();
    ui.provideBoatLength();
    int boatLength = ui.promptBoatLength();
    ui.provideMemberId();
    String id7 = ui.promptMemberId();
    menu.registerNewBoat(menu.getSpecificMember(memberList, id7), name, boatType, boatLength);
    ui.choiceSevenFinished();
  }

  public void delete_boat(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceEight();
    ui.provideMemberId();
    String id8 = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(menu.getSpecificMember(memberList, id8));
    ui.provideBoatName();
    String boatName8 = ui.promptBoatName();
    menu.deleteBoat(menu.getSpecificMember(memberList, id8),
            menu.getSpecificMember(memberList, id8).getSpecificBoat(boatName8));
    ui.choiceEightFinished();
  }

  public void change_boat_info(Menu menu, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceNine();
    ui.provideMemberId();
    String id9 = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(menu.getSpecificMember(memberList, id9));
    ui.provideBoatName();
    String boatName = ui.promptBoatName();
    ui.provideNewBoatName();
    String newBoatName = ui.promptBoatName();
    ui.provideNewBoatType();
    String newBoatType = ui.promptBoatType();
    ui.provideNewBoatLength();
    int newBoatLength = ui.promptBoatLength();
    menu.changeBoatInfo(menu.getSpecificMember(memberList, id9),
            menu.getSpecificMember(memberList, id9).getSpecificBoat(boatName), newBoatName,
            newBoatType, newBoatLength);
    ui.choiceNineFinished();
  }
}