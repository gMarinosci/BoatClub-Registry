package controller;

import model.domain.MemberRegistry;
import view.EnglishView;
import view.GermanView;
import view.View;

/**
 * controller class that starts the program.
 */
public class App {
  /**
   * Methods that start the program are called in main.
   */
  public static void main(String[] args) {

    View ui = new EnglishView();
    MemberRegistry registry = new MemberRegistry();
    User user = new User();

    user.run(registry, ui);

  }
}
