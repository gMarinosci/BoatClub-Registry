package controller;

import java.util.ArrayList;
import model.domain.Member;
import model.domain.Menu;
import view.UserInterface;

/**
 * controller class that starts the program.
 */
public class App {
  /**
   * Methods that start the program are called in main.
   */
  public static void main(String[] args) {

    UserInterface ui = new UserInterface();
    Menu menu = new Menu();
    User user = new User();
    ArrayList<Member> memberList = menu.createData();

    user.run(menu, ui, memberList);

  }
}
