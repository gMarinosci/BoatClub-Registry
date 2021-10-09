package model.domain;

import view.UserInterface;

import java.util.ArrayList;

public class Menu {




  public void deleteMember (ArrayList < Member > memberArrayList, String ID){
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getMemberId().equals(ID)) {
        memberArrayList.remove(i);
        break;
      }
    }
  }
  public void showSpecificMemberInfo (ArrayList < Member > memberArrayList, String name, String lastname){
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getFirstName().equals(name) && memberArrayList.get(i).getLastName().equals(lastname)) {
        ui.showSpecificMemberInfo(memberArrayList.get(i));
        break;
      }
    }
  }

  public void addNewMember (ArrayList < Member > memberArrayList, String name, String lastname, int personalNumber){
    Member member = new Member(name, lastname, personalNumber);
    memberArrayList.add(member);
  }

  public void changeMemberInformation (ArrayList < Member > memberArrayList, String ID){

  }
}
}