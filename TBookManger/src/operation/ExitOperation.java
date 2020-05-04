package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-30
 * Time: 19:44
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("退出系统");
        System.exit(1);
    }
}
