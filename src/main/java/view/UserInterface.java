package view;

import jdk.internal.misc.FileSystemOption;
import model.domain.Member;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  Scanner in = new Scanner(System.in);

  public void mainMenu() {
    System.out.println("Welcome home buddy");
  }

  public void promptMemberInfo() {

  }

  public void promptBoatInfo() {

  }

  public String promptID(){
    String ID;
    ID = in.nextLine();
    return ID;
  }

  public void showMemberListVerbose (ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + member.getLastName() + " " +  member.getPersonalNumber() + " "+ member.getMemberId() + " " + member.showInformationAboutRegistredBoats());
    }
  }

  public void showMemberListCompact(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + member.getLastName() + " " +  member.getMemberId() + " "+ member.getNumberOfBoats());
    }
  }
}
