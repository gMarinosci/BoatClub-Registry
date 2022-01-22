package model.domain;

import java.util.ArrayList;
import java.util.Random;
import model.persistence.Loader;

/**
 * Handles functionality for most requirements that are called in controller.User selection()
 */
public class MemberRegistry implements Cloneable {

  private Loader loader;
  private ArrayList<Member> memberList;

  /**
   * List of all members in the system.
   */
  public MemberRegistry() {

    this.loader = new Loader();
    this.memberList = loadMembers();
  }

  /**
   * Deletes a member and all their information.
   */
  public void deleteMember(String id) {
    for (int i = 0; i < memberList.size(); i++) {
      if (memberList.get(i).getMemberId().equals(id)) {
        memberList.remove(i);
        break;
      }
    }
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public ArrayList<Member> getMemberList() {
    return (ArrayList<Member>) memberList.clone();
  }

  /**
   * Finds specific member object in member list.
   */
  public Member getSpecificMember(String id) {
    Member member = memberList.get(0);
    if (member.getMemberId().equals(id)) {
      return member;
    } else {
      for (int i = 0; i < memberList.size(); i++) {
        if (memberList.get(i).getMemberId().equals(id)) {
          member = memberList.get(i);
          return member;
        }
      }
    }
    return null;
  }

  /**
   * Adds new member to the list.

   *  @param name name chosen by the user.
   * @param lastname last name chose by the user.
   * @param personalNumber personal number chosen by the user.
   */
  public void addNewMember(String name, String lastname, int personalNumber) {
    Member member = new Member(name, lastname, personalNumber);
    member.setId(getUniqueId());
    memberList.add(member);
  }

  public void changeMemberInformation(Member member, String firstname, String lastname, int personalNumber) {
    member.changePersonalInformation(firstname, lastname, personalNumber);

  }

  public boolean registerNewBoat(Member member, String name, String boatType, int length) {
    Boat boat = new Boat(name, boatType, length);
    if(isBoatNameUnique(boat)) {
      member.addNewBoat(boat);
      return true;
    }
    return false;
  }

  public boolean isBoatNameUnique(Boat boat){
    for(Member member: memberList){
      ArrayList<String> boatsNameList = member.getBoatsName();
      for(String name: boatsNameList){
        if(boat.getName().equals(name)){
          return false;
        }
      }
    }
    return true;
  }

  public void deleteBoat(Member member, Boat boat) {
    member.deleteSpecificBoat(boat);
  }

  public void changeBoatInfo(Member member, Boat boat, String name, String boatType, int length) {
    member.changeSpecificBoatInfo(boat, name, boatType, length);
  }

  private String generateId() {
    Random rnd = new Random();
    String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      sb = sb.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
    }
    return sb.toString();
  }

  private boolean isUnique(String id) {
    for (Member m : memberList) {
      if (m.getMemberId() != null && m.getMemberId().equals(id)) {
        return false;
      }
    }
    return true;
  }

  private String getUniqueId() {

    String id = generateId();

    if (!isUnique(id)) {
      return getUniqueId();
    }
    return id;
  }

  private ArrayList<Member> loadMembers() {
    memberList = loader.load();
    for (Member member : memberList) {
      member.setId(getUniqueId());
    }
    return memberList;
  }
}
