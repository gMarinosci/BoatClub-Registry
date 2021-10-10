package model.domain;

import java.util.ArrayList;
import view.UserInterface;

public class Menu {

  public ArrayList<Member> createData() {
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat preparedBoatOne = new Boat("Sailboat", 15);
    Boat preparedBoatTwo = new Boat("Motorsailer", 30);
    Boat preparedBoatThree = new Boat("Other", 15);
    Boat preparedBoatFour = new Boat("Sailboat", 15);
    Member preparedMemberOne = new Member("John", "Snow", 1111);
    preparedMemberOne.addNewBoat(preparedBoatOne);
    Member preparedMemberTwo = new Member("Han", "Solo", 2222);
    preparedMemberTwo.addNewBoat(preparedBoatTwo);
    Member preparedMemberThree = new Member("Luke", "Skywalker", 3333);
    preparedMemberThree.addNewBoat(preparedBoatThree);
    preparedMemberThree.addNewBoat(preparedBoatFour);
    membersList.add(preparedMemberOne);
    membersList.add(preparedMemberTwo);
    membersList.add(preparedMemberThree);
    return membersList;
  }


  public void deleteMember(ArrayList<Member> memberArrayList, String id) {
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getMemberId().equals(id)) {
        memberArrayList.remove(i);
        break;
      }
    }
  }

  public Member getSpecificMember(ArrayList<Member> memberArrayList, String id) {
    Member member = memberArrayList.get(0);
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getMemberId().equals(id)) {
        member = memberArrayList.get(i);
      }
    }
    return member;
  }


  public void addNewMember(ArrayList<Member> memberArrayList, String name, String lastname, int personalNumber) {
    Member member = new Member(name, lastname, personalNumber);
    memberArrayList.add(member);
  }

  public void changeMemberInformation(Member member, String firstname, String lastname, int personalNumber) {
    member.changePersonalInformation(firstname, lastname, personalNumber);

  }

  public void registerNewBoat(Member member, String boatType, int length) {
    Boat boat = new Boat(boatType, length);
    member.addNewBoat(boat);
  }

  public void deleteBoat(Member member, Boat boat) {
    member.deleteSpecificBoat(boat);
  }

  public void changeBoatInfo(Member member, Boat boat, String boatType, int length) {
    member.changeSpecificBoatInfo(boat, boatType, length);
  }
}
