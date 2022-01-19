package view;

import model.domain.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GermanView extends ViewBase{
  Scanner in = new Scanner(System.in, "UTF-8");

  public void mainMenu() {
    System.out.println("***** Menu *****\n"
            + "(a) Ausführliche Liste aller Mitglieder anzeigen\n"
            + "(b) Kurze Liste aller Mitglieder anzeigen\n"
            + "(c) Neues Boot registrieren\n"
            + "(d) Boot löschen\n"
            + "(e) Informationen eines Bootes löschen\n"
            + "(f) Informationen eines einzelnen Mitglieds anzeigen\n"
            + "(g) Neues Mitglied hinzufügen\n"
            + "(h) Mitglied löschen\n"
            + "(i) Informationen eines Mitglieds ändern\n"

            + "\nWählen Sie eine der Optionen\n");
  }

  public MenuAction menuSelection() {

    int input = getInput();

    switch (input) {

      case 'a':
        return MenuAction.VerboseList;

      case 'b':
        return MenuAction.CompactList;

      case 'c':
        return MenuAction.NewBoat;

      case 'd':
        return MenuAction.DeleteBoat;

      case 'e':
        return MenuAction.ChangeBoatInfo;

      case 'f':
        return MenuAction.ShowMemberInfo;

      case 'g':
        return MenuAction.AddMember;

      case 'h':
        return MenuAction.DeleteMember;

      case 'i':
        return MenuAction.ChangeMemberInfo;

      default:
        break;
    }

    return null;
  }

  public void verboseList() {
    System.out.println("\nAusführliche Liste aller Mitglieder:\n");
  }
    /**
     * Displays detailed information of all members.
     */
  public void showMemberListVerbose(ArrayList< Member > memberList) {
    Comparator<Member> compareByName = (Member o1, Member o2) -> o1.getFirstName().compareTo(o2.getFirstName());

    Collections.sort(memberList, compareByName);

    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " "
              + member.getLastName() + " "
              + member.getPersonalNumber() + " "
              + member.getMemberId() + " "
              + member.getInformationAboutRegisteredBoats());
    }
  }

  public void compactList() {
    System.out.println("\nKurze Liste aller Mitglieder:\n");
  }

  /**
   * Displays only the first name, the last name, the member ID and the number of registered boats
   * of a specific member.
   */

  public void showMemberListCompact(ArrayList<Member> memberList) {
    Comparator<Member> compareByName = (Member o1, Member o2) -> o1.getFirstName().compareTo(o2.getFirstName());

    Collections.sort(memberList, compareByName);

    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      System.out.println(member.getFirstName() + " "
              + member.getLastName() + " "
              + member.getMemberId() + " "
              + member.getNumberOfBoats());
    }
  }

  public void showMemberInfo(String id) {
    System.out.println("\nInformation des Mitglieds " + id + ":");
  }

  public void newMember() {
    System.out.println("\nBitte geben Sie den Vor- und Nachnamen, sowie die Personennummer ein, um ein Mitglied hinzuzufügen.");
  }

  public void memberAdded() {
    System.out.println("\n*\t*\t*\tDas neue Mitglied wurde hinzugefügt.\n");
  }

  public void deleteMember() {
    System.out.println("\nBitte geben Sie die Mitglieds ID ein, um ein Mitglied zu löschen.");
  }

  public void memberDeleted() {
    System.out.println("\n*\t*\t*\tDas Mitglied wurde gelöscht.\n");
  }

  public void changeMemberInfo() {
    System.out.println("\nBitte geben Sie die Mitglieds ID ein, gefolgt von allen neuen Informationen, "
        + "um die Mitglieds Informationen zu bearbeiten.\n");
  }

  public void memberInfoChanged() {
    System.out.println("\n*\t*\t*\tDie neuen Informationen wurden gespeichert.\n");
  }

  public void newBoat() {
    System.out.println("\nBitte geben Sie den Namen, die Länge und die Art des Bootes ein, "
        + "um ein neues Boot zu registrieren. Außerdem wird die ID des Mitglieds benötigt, dem das Boot gehört.");
  }

  public void boatAdded() {
    System.out.println("\n*\t*\t*\tDas neue Boot wurde registriert.\n");
  }

  public void deleteBoat() {
    System.out.println("\nBitte geben Sie den Namen des Bootes ein, um ein Boot zu löschen.");
  }

  public void boatDeleted() {
    System.out.println("\n*\t*\t*\tDas Boot wurde gelöscht.\n");
  }

  /**
   * all choice methods display output to the terminal.
   */
  public void changeBoatInfo() {
    System.out.println("Bitte geben Sie die Mitglieds ID und den Namen des Bootes,"
        + " das geändert werden soll ein, um die Infromationen eines Bootes zu ändern."
        + "Gefolgt von den neuen Infromationen des Bootes.");
  }

  public void boatInfoChanged() {
    System.out.println("\n*\t*\t*\tDie Informationen des Bootes wurden geändert.\n");
  }

  public void provideMemberFirstName() {
    System.out.print("Geben Sie den Vornamen des Mitglieds ein: ");
  }

  public void provideMemberLastName() {
    System.out.print("Geben Sie den Nachnamen des Mitglieds ein: ");
  }

  public void provideMemberPersonalNumber() {
    System.out.print("Geben Sie Personennummer des Mitglieds ein: ");
  }

  public void provideMemberId() {
    System.out.print("Geben Sie die Mitglieds ID ein: ");
  }

  public void provideBoatName() {
    System.out.print("Geben Sie den Namen des Bootes ein: ");
  }

  public void provideBoatType() {
    System.out.print("Geben Sie die Art des Bootes ein: ");
  }

  public void provideBoatLength() {
    System.out.print("Geben Sie die Länge des Bootes ein: ");
  }

  public void provideNewBoatName() {
    System.out.print("Geben Sie den neuen Namen des Bootes ein: ");
  }

  public void provideNewBoatType() {
    System.out.print("Geben Sie die aktuelle Art des Bootes ein: ");
  }

  public void provideNewBoatLength() {
    System.out.print("Geben Sie die neue Länge des Bootes ein: ");
  }

  public boolean quitMessage() {
    System.out.println("Drücken Sie jede beliebige Taste, um ins Hauptmenü zurück zu kehren  " +
        "oder 'q', um den Vorgang zu beenden.");

    int input = getInput();

    if (input != 'q') {
      return true;
    } else {
      return false;
    }
  }

}
