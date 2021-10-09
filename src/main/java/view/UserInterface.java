package view;

import model.domain.Member;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  Scanner in = new Scanner(System.in);

  public void mainMenu() {

    System.out.println("Welcome home buddy");
  }

  public void promptBoatInfo() {

  }

  public String promptID(){
    String ID;
    ID = in.nextLine();
    return ID;
  }

  public String promptMemberName(){
    String name;
    name = in.nextLine();
    return name;
  }

  public String promptMemberLastName(){
    String lastname;
    lastname = in.nextLine();
    return lastname;
  }

  public int promptMemberPersonalNumber(){
    int personalNumber;
    personalNumber = in.nextInt();
    return personalNumber;
  }

  public void showMemberListVerbose (ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() +" " + member.getLastName() + " " +  member.getPersonalNumber() + " "+ member.getMemberId() + " " + member.getInformationAboutRegistredBoats());
    }
  }

  public void showMemberListCompact(ArrayList<Member> memberList) {
    for (int i = 0; i < memberList.size(); i++){
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() +" " + member.getLastName() + " " +  member.getMemberId() + " "+ member.getNumberOfBoats());
    }
  }

  public void showSpecificMemberInfo(Member member){
    System.out.println(member.getFirstName() + member.getLastName() + " " +  member.getPersonalNumber() + " "+ member.getMemberId() + " " + member.getInformationAboutRegistredBoats());
  }

  public void provideMemberFirstName(){
    System.out.print("Enter the new member first name: ");
  }
  public void provideMemberLastName(){
    System.out.print("Enter the new member last name: ");
  }
  public void provideMemberPersonalNumber(){
    System.out.print("Enter the new member personal number: ");
  }
}
