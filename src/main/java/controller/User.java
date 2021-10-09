package controller;

import model.domain.Boat;
import model.domain.Member;
import view.UserInterface;

import java.util.ArrayList;

public class User {

  public boolean run(int n) {

    switch (n) {
      case 1:
        //Verbose list
        ui.showMemberListVerbose;
      case 2:
        //Compact List
        ui.showMemberListCompact;
      case 3:
        //A specific member's information
        String name = ui.promptMemberName();
        String lastname = ui.promptMemberLastName();
        menu.showSpecificMemberInfo(name, lastname);
      case 4:
        //Add a new member
        ui.provideMemberFirstName();
        String name4 = ui.promptMemberName();
        ui.provideMemberLastName();
        String lastname4 = ui.promptMemberLastName();
        ui.provideMemberPersonalNumber();
        int personalNumber = ui.promptMemberPersonalNumber();
        menu.addNewMember(name4, lastname4, personalNumber);
      case 5:
        //Delete a member
        String ID = ui.promptID();
        menu.deleteMember(ID);
      case 6:
        //Change a member's information
        String ID6 = ui.promtID();
        menu.changeMemberInformation(ID6);
      case 7:
        //Register a new boat
      case 8:
        //Delete a boat
      case 9:
        //Change a boat's information
    }
  }

  public ArrayList<Member> createData(){
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat preparedBoatOne = new Boat("Sailboat", 15);
    Boat preparedBoatTwo = new Boat("Motorsailer", 30);
    Boat preparedBoatThree = new Boat("Other", 15);
    Boat preparedBoatFour = new Boat("Other", 15);
    Member preparedMemberOne = new Member("John", "Snow",1111);
    preparedMemberOne.addNewBoat(preparedBoatOne);
    Member preparedMemberTwo = new Member("Han", "Solo",2222);
    preparedMemberTwo.addNewBoat(preparedBoatTwo);
    Member preparedMemberThree = new Member("Luke", "Skywalker",3333);
    preparedMemberThree.addNewBoat(preparedBoatThree);
    preparedMemberThree.addNewBoat(preparedBoatFour);
    membersList.add(preparedMemberOne);
    membersList.add(preparedMemberTwo);
    membersList.add(preparedMemberThree);
    return membersList;
  }



}