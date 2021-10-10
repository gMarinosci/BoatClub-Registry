package view;

import model.domain.Member;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  Scanner in = new Scanner(System.in);

  public void mainMenu() {
    System.out.println("Welcome home buddy");
  }


  public String promptMemberName() {
    String name;
    name = in.next();
    return name;
  }

  public String promptMemberLastName() {
    String lastname;
    lastname = in.next();
    return lastname;
  }

  public int promptMemberPersonalNumber() {
    int personalNumber;
    personalNumber = in.nextInt();
    return personalNumber;
  }

  public String promptMemberID() {
    String ID;
    ID = in.next();
    return ID;
  }

  public String promptBoatType(){
    String boatType;
    boatType = in.next();
    return boatType;
  }

  public int promptBoatLength(){
    int length;
    length = in.nextInt();
    return length;
  }

  public void showMemberListVerbose (ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() +" " + member.getLastName() + " " +  member.getPersonalNumber() + " "+ member.getMemberId() + " " + member.getInformationAboutRegistredBoats());
    }
  }

  public void showMemberListCompact(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() +" " + member.getLastName() + " " +  member.getMemberId() + " "+ member.getNumberOfBoats());
    }
  }

  public void showSpecificMemberInfo(Member member) {
    System.out.println(member.getFirstName() + member.getLastName() + " " +  member.getPersonalNumber() + " "+ member.getMemberId() + " " + member.getInformationAboutRegistredBoats());
  }

  public void showInformationAboutRegisteredBoats(Member member){
    System.out.println(member.getInformationAboutRegistredBoats());
  }


  public void provideMemberFirstName() {
    System.out.print("Enter member first name: ");
  }
  public void provideMemberLastName() {
    System.out.print("Enter member last name: ");
  }
  public void provideMemberPersonalNumber() {
    System.out.print("Enter member personal number: ");
  }
  public void provideMemberID() {
    System.out.print("Enter member ID: ");
  }
  public void provideBoatType() {
    System.out.print("Enter boat type: ");
  }
  public void provideBoatLength() {
    System.out.print("Enter boat length: ");
  }
  public void provideNewBoatType(){
    System.out.print("Enter new boat type: ");
  }
  public void provideNewBoatLength(){
    System.out.print("Enter new boat length: ");
  }

  public int getInput() {
    try {
      int c = System.in.read();
      while (c == '\r' || c == '\n') {
        c = System.in.read();
      }
      return c;
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return 0;
    }
  }

  public void quitMessage() {
    System.out.println("Press any key to return to main menu or 'q' to quit.");
  }
}
