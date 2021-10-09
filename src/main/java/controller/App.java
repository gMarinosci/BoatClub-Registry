package controller;

import model.domain.Member;
import view.UserInterface;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    UserInterface view = new UserInterface();
    User user = new User();
    ArrayList<Member> membersList = user.createData();

    while (user.active(view)) {

    }
  }




}
