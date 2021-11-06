package controller;

import model.domain.MemberRegistry;
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
    MemberRegistry registry = new MemberRegistry();
    User user = new User();

    user.run(registry, ui);

  }
}
