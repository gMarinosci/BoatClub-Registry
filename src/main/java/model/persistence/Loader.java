package model.persistence;

import java.util.ArrayList;
import model.domain.Boat;
import model.domain.Member;

/**
 * class to load the member data manually, until the persistence interface is properly implemented.
 */
public class Loader {
  /**
   * hard coded data to be put into the member registry.

   * @return member registry.
   */
  public ArrayList<Member> load() {
    ArrayList<Member> membersList = new ArrayList<Member>();
    Boat preparedBoatOne = new Boat("Britney", "Sailboat", 15);
    Boat preparedBoatTwo = new Boat("Rihanna", "Motorsailer", 30);
    Boat preparedBoatThree = new Boat("Shakira", "Other", 15);
    Boat preparedBoatFour = new Boat("Beyonce", "Sailboat", 15);
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
}
