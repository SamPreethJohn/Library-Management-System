import java.util.Scanner;

public class library {
  public String bookname;
  public String authorname;
  private int serialno;
  public int quantityno;

  public library() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the book: ");
    this.bookname = sc.nextLine();
    System.out.println("Enter the name of the Author: ");
    this.authorname = sc.nextLine();
    System.out.println("Enter the serial number of the book: ");
    this.serialno = sc.nextInt();
    System.out.println("Enter the Quantity of the book: ");
    this.quantityno = sc.nextInt();
  }

  public String getbookname() { return this.bookname; }
  public String getauthorname() { return this.authorname; }
  public int getserialno() { return this.serialno; }
  public int getquantityno() { return this.quantityno; }
  public void setquantityno(int quantity) { this.quantityno = quantity; }
}



