package controller;

import model.domain.Boat;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;

import javax.swing.text.View;
import java.util.ArrayList;

public class User {

  public void run(Menu menu, UserInterface ui, ArrayList<Member> memberList) {

    do {
      ui.mainMenu();
      int c = ui.getInput();
      selection(c, ui, menu, memberList);
      ui.quitMessage();
    } while(ui.getInput() != 'q');
  }

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
        String name = ui.promptMemberName();
        String lastname = ui.promptMemberLastName();
        menu.showSpecificMemberInfo(memberList, name, lastname);
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
        String ID = ui.promptID();
        menu.deleteMember(memberList, ID);
        break;
      case 6:
        //Change a member's information
        String ID6 = ui.promptID();
        menu.changeMemberInformation(memberList, ID6);
        break;
      case 7:
        //Register a new boat
      case 8:
        //Delete a boat
      case 9:
        //Change a boat's information
    }
  }
}