package controller;

import model.domain.MemberRegistry;
import view.EnglishView;

/**
 * Provides functionality of ui menu.
 */
public class User {
  /**
   * Runs the program until the input on the terminal is q.
   * When q is entered the program ends.
   */
  public void run(MemberRegistry registry, EnglishView ui) {

    boolean active;

    do {
      ui.mainMenu();
      selection(ui, registry);
      active = ui.quitMessage();
    } while (active);
  }

  /**
   * Provides all requirements as menu options.
   */
  public void selection(EnglishView ui, MemberRegistry registry) {

    switch (ui.menuSelection()) {

      case VerboseList:
        verboseList(registry, ui);
        break;

      case CompactList:
        compactList(registry, ui);
        break;

      case ShowMemberInfo:
        showMemberInformation(registry, ui);
        break;

      case AddMember:
        addMember(registry, ui);
        break;

      case DeleteMember:
        deleteMember(registry, ui);
        break;

      case ChangeMemberInfo:
        changeMemberInformation(registry, ui);
        break;

      case NewBoat:
        registerNewBoat(registry, ui);
        break;

      case DeleteBoat:
        deleteBoat(registry, ui);
        break;

      case ChangeBoatInfo:
        changeBoatInfo(registry, ui);
        break;
    }
  }

  public void verboseList(MemberRegistry registry, EnglishView ui) {
    ui.verboseList();
    ui.showMemberListVerbose(registry.getMemberList());
  }

  public void compactList(MemberRegistry registry, EnglishView ui) {
    ui.compactList();
    ui.showMemberListCompact(registry.getMemberList());
  }

  /**
   * shows the information of a member.

   * @param registry the member list.
   * @param ui user interface.
   */
  public void showMemberInformation(MemberRegistry registry, EnglishView ui) {
    ui.provideMemberId();
    String id = ui.promptMemberId();
    ui.showMemberInfo(id);
    ui.showSpecificMemberInfo(registry.getSpecificMember(id));
  }

  /**
   * Adds a member to the registry.

   * @param registry the member list.
   * @param ui user interface.
   */
  public void addMember(MemberRegistry registry, EnglishView ui) {
    ui.newMember();
    ui.provideMemberFirstName();
    String name = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastname = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber = ui.promptMemberPersonalNumber();
    registry.addNewMember(name, lastname, personalNumber);
    ui.memberAdded();
  }

  /**
   * deletes a member.

   * @param registry Member list.
   * @param ui user interface.
   */
  public void deleteMember(MemberRegistry registry, EnglishView ui) {
    ui.deleteMember();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    registry.deleteMember(id);
    ui.memberDeleted();
  }

  /**
   * Changes the information of a member.

   * @param registry The member list.
   * @param ui user list.
   */
  public void changeMemberInformation(MemberRegistry registry, EnglishView ui) {
    ui.changeMemberInfo();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    ui.provideMemberFirstName();
    String firstName = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastName = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber = ui.promptMemberPersonalNumber();
    registry.changeMemberInformation(registry.getSpecificMember(id), firstName, lastName, personalNumber);
    ui.memberInfoChanged();
  }

  /**
   * Registers a new boat for a specific member.

   * @param registry Member list.
   * @param ui user interface.
   */
  public void registerNewBoat(MemberRegistry registry, EnglishView ui) {
    ui.newBoat();
    ui.provideBoatName();
    String name = ui.promptBoatName();
    ui.provideBoatType();
    String boatType = ui.promptBoatType();
    ui.provideBoatLength();
    int boatLength = ui.promptBoatLength();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    if (registry.registerNewBoat(registry.getSpecificMember(id), name, boatType, boatLength)){
      ui.boatAdded();
    }
    else{
      ui.boatHasNotBeenAdded();
    }
  }

  /**
   * Deletes the boat.

   * @param registry member list.
   * @param ui user interface.
   */
  public void deleteBoat(MemberRegistry registry, EnglishView ui) {
    ui.deleteBoat();
    ui.provideMemberId();
    String id = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(registry.getSpecificMember(id));
    ui.provideBoatName();
    String boatName = ui.promptBoatName();
    registry.deleteBoat(registry.getSpecificMember(id),
            registry.getSpecificMember(id).getSpecificBoat(boatName));
    ui.boatDeleted();
  }

  /**
   * Changes the information of boats.

   * @param registry The member list.
   * @param ui user interface.
   */
  public void changeBoatInfo(MemberRegistry registry, EnglishView ui) {
    ui.changeBoatInfo();
    ui.provideMemberId();
    String id   = ui.promptMemberId();
    ui.showInformationAboutRegisteredBoats(registry.getSpecificMember(id));
    ui.provideBoatName();
    String boatName = ui.promptBoatName();
    ui.provideNewBoatName();
    String newBoatName = ui.promptBoatName();
    ui.provideNewBoatType();
    String newBoatType = ui.promptBoatType();
    ui.provideNewBoatLength();
    int newBoatLength = ui.promptBoatLength();
    registry.changeBoatInfo(registry.getSpecificMember(id),
            registry.getSpecificMember(id).getSpecificBoat(boatName), newBoatName,
            newBoatType, newBoatLength);
    ui.boatInfoChanged();
  }
}