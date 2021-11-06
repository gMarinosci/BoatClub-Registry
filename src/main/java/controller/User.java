package controller;

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
  public void run(MemberRegistry registry, UserInterface ui) {

    do {
      ui.mainMenu();
      int choice = ui.getInput();
      selection(choice, ui, registry);
      ui.quitMessage();
    } while (ui.getInput() != 'q');
  }

  /**
   * Provides all requirements as menu options.
   */
  public void selection(int n, UserInterface ui, MemberRegistry registry) {

    switch (Character.getNumericValue(n)) {
      case 1:
        //Verbose list
        verboseList(registry, ui);
        break;
      case 2:
        //Compact List
        compactList(registry, ui);
        break;
      case 3:
        //A specific member's information
        showMemberInformation(registry, ui);
        break;
      case 4:
        //Add a new member
        addMember(registry, ui);
        break;
      case 5:
        //Delete a member
        deleteMember(registry, ui);
        break;
      case 6:
        //Change a member's information
        changeMemberInformation(registry, ui);
        break;
      case 7:
        //Register a new boat
       registerNewBoat(registry, ui);
        break;

      case 8:
        //Delete a boat
        deleteBoat(registry, ui);
        break;

      case 9:
        //Change a boat's information
        changeBoatInfo(registry, ui);
        break;
      default:
        System.out.println("Error");
    }
  }
  public void verboseList(MemberRegistry registry, UserInterface ui){
    ui.choiceOne();
    ui.showMemberListVerbose(registry.getMemberList());
  }

  public void compactList(MemberRegistry registry, UserInterface ui){
    ui.choiceTwo();
    ui.showMemberListCompact(registry.getMemberList());
  }

  public void showMemberInformation(MemberRegistry registry, UserInterface ui) {
    ui.provideMemberId();
    String id3 = ui.promptMemberId();
    ui.choiceThree(id3);
    ui.showSpecificMemberInfo(registry.getSpecificMember(id3));
  }

  public void addMember(MemberRegistry registry, UserInterface ui) {
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

  public void deleteMember(MemberRegistry registry, UserInterface ui) {
    ui.choiceFive();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    registry.deleteMember(id);
    ui.choiceFiveFinished();
  }

  public void changeMemberInformation(MemberRegistry registry, UserInterface ui) {
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

  public void registerNewBoat(MemberRegistry registry, UserInterface ui) {
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

  public void deleteBoat(MemberRegistry registry, UserInterface ui) {
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

  public void changeBoatInfo(MemberRegistry registry, UserInterface ui) {
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