package controller;

import model.domain.Boat;
import model.domain.BoatType;
import model.domain.Member;
import view.UserInterface;

import java.util.ArrayList;

public class User {

  public ArrayList<Member> createData(){
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat queen = new Boat(BoatType.SAILBOAT, 15);
    Boat king = new Boat(BoatType.MOTORSAILER, 30);
    Boat little = new Boat(BoatType.OTHER, 15);
    Boat big = new Boat(BoatType.OTHER, 15);
    Member preparedMemberOne = new Member("John", "Snow",1111);
    preparedMemberOne.addNewBoat(queen);
    Member preparedMemberTwo = new Member("Han", "Solo",2222);
    preparedMemberTwo.addNewBoat(king);
    Member preparedMemberThree = new Member("Luke", "Skywalker",3333);
    preparedMemberThree.addNewBoat(little);
    preparedMemberThree.addNewBoat(big);
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

}
