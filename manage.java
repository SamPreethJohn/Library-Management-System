import java.util.Scanner;

public class manage {
  Scanner sc = new Scanner(System.in);
  public library book_list[] = new library[10];
  public int c = 0;

  void add() {
    if (c < book_list.length) {
      library l = new library();
      book_list[c] = l;
      c++;
    } else {
      System.out.println("The list of book is full in the shelfs");
    }
  }

  void displayallbook() {

    if (c == 0) {
      System.out.println("No books to display");
    }
    for (int i = 0; i < book_list.length; i++) {
      if (book_list[i] != null) {
        System.out.println("Book name: " + book_list[i].getbookname() +
            ", Author name: " + book_list[i].getauthorname() +
            ", Serial number: " + book_list[i].getserialno() +
            ", Quantity of the book: " + book_list[i].getquantityno());
      }
    }
  }

  void search() {
    System.out.println("Enter the Book name: ");
    String namesearch = sc.nextLine();
    if (c == 0) {
      System.out.println("No book to display");
      return;
    }
    boolean found = false;
    for (int i = 0; i < book_list.length; i++) {
      if (book_list[i] != null && namesearch.equals(book_list[i].getbookname())) {
        System.out.println("Book Found: " + book_list[i].getbookname() + ", Author name: "
            + book_list[i].getauthorname() + ", Serial number: " + book_list[i].getserialno());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No book found with the name: " + namesearch);
    }
  }

  void ausearch() {
    System.out.println("Enter the Author name");
    String authorsearch = sc.nextLine();
    if (c == 0) {
      System.out.println("No book to display");
      return;
    }
    boolean found = false;
    for (int i = 0; i < book_list.length; i++) {
      if (book_list[i] != null && authorsearch.equals(book_list[i].getauthorname())) {
        System.out.println("Book name " + book_list[i].getbookname() + ", Author name "
            + book_list[i].getauthorname() + ", Serial number " + book_list[i].getserialno());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No book found with the author name: " + authorsearch);
    }
  }

  void update() {
    System.out.println("Enter the Book name: ");
    String namesearch = sc.nextLine();
    int quantity = 0;

    while(true) {
    System.out.println("Enter the quantity to add: ");
    try{
        quantity = Integer.parseInt(sc.nextLine());
        break;
    }catch(NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number.");
    }
}
    
    if (c == 0) {
      System.out.println("No book to display");
        return;
    }
    boolean found = false;
    for (int i = 0; i < book_list.length; i++) {
      if (book_list[i] != null && namesearch.equals(book_list[i].getbookname())) {
        book_list[i].setquantityno(quantity + book_list[i].getquantityno());
        System.out.println("Quantity updated successfully.");
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("No book found with the name: " + namesearch);
    }
  }

  void borrow(studentmanage stuman) {
    System.out.println("Enter the student roll number");
    int rollnum = sc.nextInt();

    if (stuman.isstudent(rollnum)) {
      System.out.println("Enter the serial number of the book to borrow:");
      int serialno = sc.nextInt();
       
      boolean bookFound = false;

      for (int i = 0; i < book_list.length; i++) {
        if (book_list[i] != null && (book_list[i].getserialno() == serialno)) {
          bookFound = true;

          if (book_list[i].getquantityno() > 0) {
          book_list[i].setquantityno(book_list[i].getquantityno() - 1);

           for (int j = 0; j < stuman.stmanagement_list.length; j++) {
                    if (stuman.stmanagement_list[j] != null && stuman.stmanagement_list[j].getrollnum() == rollnum) {
                        stuman.stmanagement_list[j].setbookborrowed(book_list[i].getbookname());
                        break;
                    }
                }

          System.out.println("Book is borrowed Successfully.");
        } else {
          System.out.println("Book not available or invalid serial number.");
        }
        return;
      }
      }
      if (!bookFound) {
      System.out.println("Book with the given serial number not found.");
      }
    } else {
      System.out.println("Student not found.");
    }

  }
}