package controller;

import model.domain.Boat;
import model.domain.Member;
import view.UserInterface;

import java.util.ArrayList;

public class User {

  public ArrayList<Member> createData(){
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat preparedBoatOne = new Boat("Sailboat", 15);
    Boat preparedBoatTwo = new Boat("Motorsailer", 30);
    Boat preparedBoatThree = new Boat("Other", 15);
    Boat preparedBoatFour = new Boat("Other", 15);
    Member preparedMemberOne = new Member("John", "Snow",1111);
    preparedMemberOne.addNewBoat(preparedBoatOne);
    Member preparedMemberTwo = new Member("Han", "Solo",2222);
    preparedMemberTwo.addNewBoat(preparedBoatTwo);
    Member preparedMemberThree = new Member("Luke", "Skywalker",3333);
    preparedMemberThree.addNewBoat(preparedBoatThree);
    preparedMemberThree.addNewBoat(preparedBoatFour);
    membersList.add(preparedMemberOne);
    membersList.add(preparedMemberTwo);
    membersList.add(preparedMemberThree);
    return membersList;
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
