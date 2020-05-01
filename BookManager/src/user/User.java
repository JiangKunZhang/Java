package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-30
 * Time: 19:49
 */
public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(BookList bookList,int choice) {
        this.operations[choice].work(bookList);
    }
}
