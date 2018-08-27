package com.designpattern;

/**
 * Created by ningli on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("环游世界80天"));
        bookShelf.appendBook(new Book("圣经"));
        bookShelf.appendBook(new Book("灰姑娘"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println("-----------Test-----------book值=" + book.getName() + "," + "当前类=.()");
        }
    }
}
