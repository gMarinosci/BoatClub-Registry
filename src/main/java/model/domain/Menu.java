package model.domain;

import view.UserInterface;

import java.util.ArrayList;

public class Menu {

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


  public void deleteMember (ArrayList < Member > memberArrayList, String ID){
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getMemberId().equals(ID)) {
        memberArrayList.remove(i);
        break;
      }
    }
  }
  public Member showSpecificMemberInfo (ArrayList < Member > memberArrayList, String name, String lastname){
    Member member = null;
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getFirstName().equals(name) && memberArrayList.get(i).getLastName().equals(lastname))
        member = memberArrayList.get(i);
        break;
      }
    return member;
  }


  public void addNewMember (ArrayList < Member > memberArrayList, String name, String lastname, int personalNumber){
    Member member = new Member(name, lastname, personalNumber);
    memberArrayList.add(member);
  }

  public void changeMemberInformation (ArrayList < Member > memberArrayList, String ID){

  }

}
