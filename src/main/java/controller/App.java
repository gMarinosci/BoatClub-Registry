package controller;

import view.UserInterface;

public class App {

  public static void main(String[] args) {
    UserInterface ui;
    User user;

    ui = new UserInterface();
    ui.mainMenu();
  }
}
