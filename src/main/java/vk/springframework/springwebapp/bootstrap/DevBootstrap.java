package vk.springframework.springwebapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import vk.springframework.springwebapp.model.Author;
import vk.springframework.springwebapp.model.Book;
import vk.springframework.springwebapp.repositories.AuthorRepository;
import vk.springframework.springwebapp.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData(){
        Author varun=new Author("Varun","Kathuria");
        Book book=new Book("domain design","1234","Harper");
        varun.getBooks().add(book);
        book.getAuthors().add(varun);
        authorRepository.save(varun);
        bookRepository.save(book);

    }
}
