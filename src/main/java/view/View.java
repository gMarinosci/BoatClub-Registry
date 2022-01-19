package view;

import model.domain.Member;

import java.util.ArrayList;

public interface View {

  void mainMenu();

  MenuAction menuSelection();

  void verboseList();

  void compactList();

  void showMemberInfo(String id);

  void newMember();

  void memberAdded();

  void deleteMember();

  void memberDeleted();

  void changeMemberInfo();

  void memberInfoChanged();

  void newBoat();

  void boatAdded();

  void deleteBoat();

  void boatDeleted();

  void changeBoatInfo();

  void boatInfoChanged();

  String promptMemberName();

  String promptMemberLastName();

  int promptMemberPersonalNumber();

  String promptMemberId();

  String promptBoatType();

  int promptBoatLength();

  String promptBoatName();

  void showMemberListVerbose(ArrayList<Member> memberList);

  void showMemberListCompact(ArrayList<Member> memberList);

  void showSpecificMemberInfo(Member member);

  void showInformationAboutRegisteredBoats(Member member);

  void provideMemberFirstName();

  void provideMemberLastName();

  void provideMemberPersonalNumber();

  void provideMemberId();

  void provideBoatName();

  void provideBoatType();

  void provideBoatLength();

  void provideNewBoatName();

  void provideNewBoatType();

  void provideNewBoatLength();

  int getInput();

  boolean quitMessage();
}
