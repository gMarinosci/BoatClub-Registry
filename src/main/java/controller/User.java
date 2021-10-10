package controller;

import java.util.ArrayList;
import javax.swing.text.View;
import model.domain.Boat;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;


public class User {

  public void run(Menu menu, UserInterface ui, ArrayList<Member> memberList) {

    do {
      ui.mainMenu();
      int c = ui.getInput();
      selection(c, ui, menu, memberList);
      ui.quitMessage();
    } while (ui.getInput() != 'q');
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
        ui.provideMemberID();
        String id3 = ui.promptMemberID();
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
        ui.provideMemberID();
        String id = ui.promptMemberID();
        menu.deleteMember(memberList, id);
        break;
      case 6:
        //Change a member's information
        ui.provideMemberID();
        String id6 = ui.promptMemberID();
        menu.changeMemberInformation(memberList, id6);
        break;
      case 7:
        //Register a new boat
      case 8:
        //Delete a boat
      case 9:
        //Change a boat's information
      default:
        System.out.println("Error");
    }
  }
}