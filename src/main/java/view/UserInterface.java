package view;

import jdk.internal.misc.FileSystemOption;
import model.domain.Member;

import java.util.ArrayList;

public class UserInterface {

  public void mainMenu() {
    System.out.println("Welcome home buddy");
  }

  public void promptMemberInfo() {

  }

  public void promptBoatInfo() {

  }

  public void showMemberListVerbose (ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member);
    }
  }

  public void showMemberListCompact(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " " +  member.getMemberId() + " "+ member.getNumberOfBoats());
    }
  }
}
