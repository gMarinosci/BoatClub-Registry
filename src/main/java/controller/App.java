package controller;

import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {

    UserInterface ui = new UserInterface();
    Menu menu = new Menu();
    User user = new User();
    ArrayList<Member> memberList = menu.createData();

    while (user.run(menu, ui, memberList)) {

    }
  }
}
