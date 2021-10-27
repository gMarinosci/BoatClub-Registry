package model.domain;

import java.util.ArrayList;
import view.UserInterface;

/**
 * Handles functionality for most requirements that are called in controller.User selection()
 */
public class Menu {
  /**
   * creates data for three example members manually
   * instead of a persistent loading and saving to a file or database.
   */
  public ArrayList<Member> createData() {
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat preparedBoatOne = new Boat("Britney", "Sailboat", 15);
    Boat preparedBoatTwo = new Boat("Rihanna", "Motorsailer", 30);
    Boat preparedBoatThree = new Boat("Shakira", "Other", 15);
    Boat preparedBoatFour = new Boat("Beyonce", "Sailboat", 15);
    Member preparedMemberOne = new Member("John", "Snow", 1111);
    preparedMemberOne.setId(membersList);
    preparedMemberOne.addNewBoat(preparedBoatOne);
    Member preparedMemberTwo = new Member("Han", "Solo", 2222);
    preparedMemberTwo.setId(membersList);
    preparedMemberTwo.addNewBoat(preparedBoatTwo);
    Member preparedMemberThree = new Member("Luke", "Skywalker", 3333);
    preparedMemberThree.setId(membersList);
    preparedMemberThree.addNewBoat(preparedBoatThree);
    preparedMemberThree.addNewBoat(preparedBoatFour);
    membersList.add(preparedMemberOne);
    membersList.add(preparedMemberTwo);
    membersList.add(preparedMemberThree);
    return membersList;
  }

  /**
   * Deletes a member and all their information.
   */
  public void deleteMember(ArrayList<Member> memberArrayList, String id) {
    for (int i = 0; i < memberArrayList.size(); i++) {
      if (memberArrayList.get(i).getMemberId().equals(id)) {
        memberArrayList.remove(i);
        break;
      }
    }
  }

  /**
   * Finds specific member object in member list.
   */
  public Member getSpecificMember(ArrayList<Member> memberArrayList, String id) {
    Member member = memberArrayList.get(0);
    if(member.getMemberId().equals(id)) {
      return member;
    }
    else{
      for (int i = 0; i < memberArrayList.size(); i++) {
        if (memberArrayList.get(i).getMemberId().equals(id)) {
          member = memberArrayList.get(i);
          return member;
        }
      }
    }
    return null;
  }

  /**
   * Adds new member to the list.
   *
   * @param memberArrayList list of all current members.
   * @param name name chosen by the user.
   * @param lastname last name chose by the user.
   * @param personalNumber personal number chosen by the user.
   */
  public void addNewMember(ArrayList<Member> memberArrayList, String name, String lastname, int personalNumber) {
    Member member = new Member(name, lastname, personalNumber);
    member.setId(memberArrayList);
    memberArrayList.add(member);
  }

  public void changeMemberInformation(Member member, String firstname, String lastname, int personalNumber) {
    member.changePersonalInformation(firstname, lastname, personalNumber);

  }

  public void registerNewBoat(Member member, String name, String boatType, int length) {
    Boat boat = new Boat(name, boatType, length);
    member.addNewBoat(boat);
  }

  public void deleteBoat(Member member, Boat boat) {
    member.deleteSpecificBoat(boat);
  }

  public void changeBoatInfo(Member member, Boat boat, String name, String boatType, int length) {
    member.changeSpecificBoatInfo(boat, name, boatType, length);
  }
}
