import java.util.Scanner;

public class student {

  public String studentname;
  private int rollnum;
  public String department;
  public String bookborrowed;

  public student() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the student name");
    this.studentname = sc.nextLine();

    System.out.println("Enter the roll number of the student");
    this.rollnum = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter the Student department");
    this.department = sc.nextLine();

    System.out.println("Enter the name of the book borrowed");
    this.bookborrowed = sc.nextLine();
  }

  public String getstudentname() {
    return this.studentname;
  }

  public int getrollnum() {
    return this.rollnum;
  }

  public String getdepartment() {
    return this.department;
  }

  public String getbookborrowed() {
    return this.bookborrowed;
  }

  void setbookborrowed(String bookborrowed) {
    this.bookborrowed = bookborrowed;
  }

}

