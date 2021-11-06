package controller;

import java.util.ArrayList;

import model.domain.Member;
import model.domain.MemberRegistry;
import view.UserInterface;

/**
 * Provides functionality of ui menu.
 */
public class User {
  /**
   * Runs the program until the input on the terminal is q.
   * When q is entered the program ends.
   */
  public void run(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {

    do {
      ui.mainMenu();
      int choice = ui.getInput();
      selection(choice, ui, registry, memberList);
      ui.quitMessage();
    } while (ui.getInput() != 'q');
  }

  /**
   * Provides all requirements as menu options.
   */
  public void selection(int n, UserInterface ui, MemberRegistry registry, ArrayList<Member> memberList) {

    switch (Character.getNumericValue(n)) {
      case 1:
        //Verbose list
        verbose_list(registry, ui, memberList);
        break;
      case 2:
        //Compact List
        compact_list(registry, ui, memberList);
        break;
      case 3:
        //A specific member's information
        show_member_information(registry, ui, memberList);
        break;
      case 4:
        //Add a new member
        add_member(registry, ui, memberList);
        break;
      case 5:
        //Delete a member
        delete_member(registry, ui, memberList);
        break;
      case 6:
        //Change a member's information
        change_member_information(registry, ui, memberList);
        break;
      case 7:
        //Register a new boat
       register_new_boat(registry, ui, memberList);
        break;

      case 8:
        //Delete a boat
        delete_boat(registry, ui, memberList);
        break;

      case 9:
        //Change a boat's information
        change_boat_info(registry, ui, memberList);
        break;
      default:
        System.out.println("Error");
    }
  }
  public void verbose_list(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList){
    ui.choiceOne();
    ui.showMemberListVerbose(memberList);
  }

  public void compact_list(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList){
    ui.choiceTwo();
    ui.showMemberListCompact(memberList);
  }

  public void show_member_information(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.provideMemberId();
    String id3 = ui.promptMemberId();
    ui.choiceThree(id3);
    ui.showSpecificMemberInfo(registry.getSpecificMember(id3));
  }

  public void add_member(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceFour();
    ui.provideMemberFirstName();
    String name4 = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastname4 = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber = ui.promptMemberPersonalNumber();
    registry.addNewMember(name4, lastname4, personalNumber);
    ui.choiceFourFinished();
  }

  public void delete_member(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceFive();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    registry.deleteMember(id);
    ui.choiceFiveFinished();
  }

  public void change_member_information(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceSix();
    ui.provideMemberId();
    String id6 = ui.promptMemberId();
    ui.provideMemberFirstName();
    String firstName = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastName = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber6 = ui.promptMemberPersonalNumber();
    registry.changeMemberInformation(registry.getSpecificMember(id6), firstName, lastName, personalNumber6);
    ui.choiceSixFinished();
  }

  public void register_new_boat(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceSeven();
    ui.provideBoatName();
    String name = ui.promptBoatName();
    ui.provideBoatType();
    String boatType = ui.promptBoatType();
    ui.provideBoatLength();
    int boatLength = ui.promptBoatLength();
    ui.provideMemberId();
    String id7 = ui.promptMemberId();
    registry.registerNewBoat(registry.getSpecificMember(id7), name, boatType, boatLength);
    ui.choiceSevenFinished();
  }

  public void delete_boat(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceEight();
    ui.provideMemberId();
    String id8 = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(registry.getSpecificMember(id8));
    ui.provideBoatName();
    String boatName8 = ui.promptBoatName();
    registry.deleteBoat(registry.getSpecificMember(id8),
            registry.getSpecificMember(id8).getSpecificBoat(boatName8));
    ui.choiceEightFinished();
  }

  public void change_boat_info(MemberRegistry registry, UserInterface ui, ArrayList<Member> memberList) {
    ui.choiceNine();
    ui.provideMemberId();
    String id9 = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(registry.getSpecificMember(id9));
    ui.provideBoatName();
    String boatName = ui.promptBoatName();
    ui.provideNewBoatName();
    String newBoatName = ui.promptBoatName();
    ui.provideNewBoatType();
    String newBoatType = ui.promptBoatType();
    ui.provideNewBoatLength();
    int newBoatLength = ui.promptBoatLength();
    registry.changeBoatInfo(registry.getSpecificMember(id9),
            registry.getSpecificMember(id9).getSpecificBoat(boatName), newBoatName,
            newBoatType, newBoatLength);
    ui.choiceNineFinished();
  }
}