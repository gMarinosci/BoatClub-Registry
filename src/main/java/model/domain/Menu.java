package model.domain;

import view.UserInterface;

import java.util.ArrayList;

public class Menu {

  public boolean run (int n) {

    switch (n) {
      case 1:
        String ID = ui.promptID();
        menu.deletemember(ID);
    }
  }

  public void deleteMember(ArrayList<Member> memberArrayList, UserInterface ui){
    String ID = ui.promptID();
    for(int i = 0; i < memberArrayList.size(); i++){
      if(memberArrayList.get(i).getMemberId().equals(ID)){
        memberArrayList.remove(i);
        break;
      }
    }
  }
  public void showSpecificMemberInfo(ArrayList<Member> memberArrayList, UserInterface ui){
    String name = ui.promptMemberName();
    String lastname = ui.promptMemberLastName();
    for(int i = 0; i < memberArrayList.size(); i++){
      if(memberArrayList.get(i).getFirstName().equals(name) && memberArrayList.get(i).getLastName().equals(lastname)){
        ui.showSpecificMemberInfo(memberArrayList.get(i));
        break;
      }
    }
  }

  public void addNewMember(ArrayList<Member> memberArrayList, UserInterface ui){
    ui.provideMemberFirstName();
    String name = ui.promptMemberName();
    ui.provideMemberLastName();
    String lastname = ui.promptMemberLastName();
    ui.provideMemberPersonalNumber();
    int personalNumber = ui.promptMemberPersonalNumber();
    Member member = new Member(name,lastname,personalNumber);
    memberArrayList.add(member);
  }

  public void changeMemberInformation(ArrayList<Member> memberArrayList, UserInterface ui){

  }
}
