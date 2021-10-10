package controller;

import java.util.ArrayList;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;


public class App {

  public static void main(String[] args) {

    UserInterface ui = new UserInterface();
    Menu menu = new Menu();
    User user = new User();
    ArrayList<Member> memberList = menu.createData();

    user.run(menu, ui, memberList);

  }
}
