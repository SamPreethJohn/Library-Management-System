import java.util.*;

public class LibraryManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    manage ma = new manage();
    studentmanage sm = new studentmanage();
    int choice = 1;
    while (choice != 0) {
   System.out.println("╔════════════════════════════════════════════════════╗");
    System.out.println("║            WELCOME TO LIBRARY SYSTEM               ║");
    System.out.println("╠════════════════════════════════════════════════════╣");
    System.out.println("║                  BOOK MANAGEMENT                   ║");
    System.out.println("╠════════════════════════════════════════════════════╣");
    System.out.println("║ 1. Add Book                                        ║");
    System.out.println("║ 2. Display All Books                               ║");
    System.out.println("║ 3. Search Book by Name                             ║");
    System.out.println("║ 4. Search Book by Author                           ║");
    System.out.println("║ 5. Add Quantity of a Book                          ║");
    System.out.println("╠════════════════════════════════════════════════════╣");
    System.out.println("║                STUDENT MANAGEMENT                  ║");
    System.out.println("╠════════════════════════════════════════════════════╣");
    System.out.println("║ 6. Add Student                                     ║");
    System.out.println("║ 7. Display Students                                ║");
    System.out.println("║ 8. Search Student by Name                          ║");
    System.out.println("║ 9. Search Student by Roll Number                   ║");
    System.out.println("║10. Borrow a Book                                   ║");
    System.out.println("╠════════════════════════════════════════════════════╣");
    System.out.println("║ 0. Exit                                            ║");
    System.out.println("╚════════════════════════════════════════════════════╝");
    System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        ma.add();
      } else if (choice == 2) {
        ma.displayallbook();
      } else if (choice == 3) {
        ma.search();
      } else if (choice == 4) {
        ma.ausearch();
      } else if (choice == 5) {
        ma.update();
      } else if (choice == 6) {
        sm.studentadd();
      } else if (choice == 7) {
        sm.displaystudent();
      } else if (choice == 8) {
        sm.studentsearch();
      } else if (choice == 9) {
        sm.Rollnumsearch();
      } else if (choice == 10) {
        ma.borrow(sm);
      } else if (choice ==0) {
        System.out.println("Exiting...");
        return;
      }
        else { System.out.println("Invalid choice. Try again.");
    }

  }
}


}