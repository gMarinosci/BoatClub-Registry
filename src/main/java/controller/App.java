package controller;

import model.domain.Member;
import view.UserInterface;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    UserInterface ui = new UserInterface();
    User user = new User();
    ArrayList<Member> membersList = user.createData();


    ui.mainMenu();
    ui.showMemberListCompact(membersList);
    user.deleteMember(membersList,ui);
    ui.showMemberListCompact(membersList);
  }


}
