class Student {
    int bookCount = 5;

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public void borrowBook() throws InterruptedException {
        int m = bookCount;
        Thread.sleep(2000);
        bookCount = m + 1;
        System.out.println("대출완료");
    }

    public void returnBook() throws InterruptedException {
        int m = bookCount;
        Thread.sleep(3000);
        bookCount = m - 1;
        System.out.println("반납완료");
    }
}

class Library {
    public static Student student = new Student();
}

class BorrowThread extends Thread {
    public void run() {
        try {
            Library.student.borrowBook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("학생이 빌린 총 책의 갯수 : " + Library.student.getBookCount());
    }
}

class ReturnThread extends Thread {
    public void run() {
        try {
            Library.student.returnBook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("학생이 빌린 총 책의 갯수 : " + Library.student.getBookCount());
    }
}

public class google_Thread_synchronized_StudentBook {
    public static void main(String[] args) {
        System.out.println("현재 대출한 책의 갯수 : " + Library.student.getBookCount());

        BorrowThread bt = new BorrowThread();
        ReturnThread rt = new ReturnThread();

        bt.setPriority(10);
        bt.start();
        rt.start();

        try {
            bt.join();
            rt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
