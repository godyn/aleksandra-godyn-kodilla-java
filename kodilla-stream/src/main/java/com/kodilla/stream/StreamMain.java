package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.ToSpaceOut;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;


import static java.time.LocalDate.now;


public class StreamMain {

        public static void main(String[] args) {

            System.out.println("Task from module 7.3");
            BookDirectory theBookDirectory = new BookDirectory();

            Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .collect(Collectors.toMap(Book::getSignature, book -> book));

            System.out.println("# elements: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

            System.out.println("\n\nUnaasisted task 7.3");
            Forum theForum = new Forum();
            Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                    .filter(user -> user.getSex()=='M')
                    .filter(user -> (now().getYear()-user.getBirthday().getYear())>19)
                    .filter(user -> user.getPostsNumber()>0)
                    .collect(Collectors.toMap(ForumUser::getUserId, user -> user));
            System.out.println("There are " + theResultMapOfForumUser.size() + " elements meeting requirements. You can see them below.");
            theResultMapOfForumUser.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);




        }

}
