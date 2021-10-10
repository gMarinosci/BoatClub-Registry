package controller;

import model.domain.Boat;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;

import java.util.ArrayList;

public class User {

  UserInterface ui = new UserInterface();
  Menu menu = new Menu();
  ArrayList<Member> memberList= menu.createData();

  public boolean run(int n) {


    switch (n) {
      case 1:
        //Verbose list
        ui.showMemberListVerbose(memberList);
      case 2:
        //Compact List
        ui.showMemberListCompact(memberList);
      case 3:
        //A specific member's information
        String name = ui.promptMemberName();
        String lastname = ui.promptMemberLastName();
        menu.showSpecificMemberInfo(memberList, name, lastname);
      case 4:
        //Add a new member
        ui.provideMemberFirstName();
        String name4 = ui.promptMemberName();
        ui.provideMemberLastName();
        String lastname4 = ui.promptMemberLastName();
        ui.provideMemberPersonalNumber();
        int personalNumber = ui.promptMemberPersonalNumber();
        menu.addNewMember(memberList, name4, lastname4, personalNumber);
      case 5:
        //Delete a member
        String ID = ui.promptID();
        menu.deleteMember(memberList, ID);
      case 6:
        //Change a member's information
        String ID6 = ui.promptID();
        menu.changeMemberInformation(memberList, ID6);
      case 7:
        //Register a new boat
      case 8:
        //Delete a boat
      case 9:
        //Change a boat's information
    }
  }




}