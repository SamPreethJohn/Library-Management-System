import java.util.Scanner;

public class studentmanage {

  Scanner sc = new Scanner(System.in);
  public student stmanagement_list[] = new student[10];
  public int c = 0;

  void studentadd() {
    if (c < stmanagement_list.length) {
      student s = new student();
      stmanagement_list[c] = s;
      c++;
    } else {
      System.out.println("The list of book owned by the student is full ");
    }
  }

  void displaystudent() {
    if (c == 0) {
      System.out.println("No students details to display");
    }
    for (int i = 0; i < stmanagement_list.length; i++) {
      if (stmanagement_list[i] != null) {
        System.out.println("Student Name " + stmanagement_list[i].getstudentname() +
            ", Roll number: " + stmanagement_list[i].getrollnum() +
            ", Department: " + stmanagement_list[i].getdepartment() +
            ", Book borrowed: " + stmanagement_list[i].getbookborrowed());
      }
    }
  }

  void studentsearch() {
    System.out.println("Enter the Student name");
    String studentse = sc.nextLine();
    boolean found = false;
    for (int i = 0; i < stmanagement_list.length; i++) {
      if (stmanagement_list[i] != null && studentse.equals(stmanagement_list[i].getstudentname())) {
        System.out.println("Student Name " + stmanagement_list[i].getstudentname() +
            ", Roll number " + stmanagement_list[i].getrollnum() +
            ", Department " + stmanagement_list[i].getdepartment() +
            ", Book borrowed" + stmanagement_list[i].getbookborrowed());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No student found with the name: " + studentse);
    }
  }

  void Rollnumsearch() {
    System.out.println("Enter the Student Roll number");
    int roll = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < stmanagement_list.length; i++) {
      if (stmanagement_list[i] != null && roll == (stmanagement_list[i].getrollnum())) {
        System.out.println("Student Name " + stmanagement_list[i].getstudentname() +
            ", Roll number " + stmanagement_list[i].getrollnum() +
            ", Department " + stmanagement_list[i].getdepartment() +
            ", Book borrowed" + stmanagement_list[i].getbookborrowed());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No student found with the Roll number: " + roll);
  }
}

  boolean isstudent(int n) {
    boolean s = false;
    for (int i = 0; i < stmanagement_list.length; i++) {
      if (stmanagement_list[i] != null && (n == stmanagement_list[i].getrollnum())) {
        s = true;
      }
    }
    return s;
  }
}