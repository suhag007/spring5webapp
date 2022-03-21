package com.example.spring5webapp.bootstrap;

import com.example.spring5webapp.domain.Author;
import com.example.spring5webapp.domain.Book;
import com.example.spring5webapp.domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.spring5webapp.repositories.AuthorRepository;
import com.example.spring5webapp.repositories.BookRepository;
import com.example.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("###### Started boootstrap app#########");

//        Publisher ptc = new Publisher();
//        ptc.setName("PTC");
//        ptc.setState("fl");
//        ptc.setCity("florida");
//        ptc.setAddressLine1("ward 1");

        Publisher oxford = new Publisher();
        oxford.setName("oxford");
        oxford.setCity("london");
        oxford.setState("london");
        oxford.setAddressLine1("street1");

        System.out.println("printing words" + publisherRepository.count());

        Author eric = new Author("eric", "evans");
        Book ddd = new Book("domain driven design", "123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(oxford);
        oxford.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(oxford);

//        Author rod = new Author("rode", "thomson");
//        Book noEJB = new Book("any random book", "123124");
//        rod.getBooks().add(noEJB);
//        noEJB.getAuthors().add(rod);
//        noEJB.setPublisher(oxford);
//        oxford.getBooks().add(noEJB);

//        authorRepository.save(rod);
//        bookRepository.save(noEJB);
//        publisherRepository.save(ptc);

        System.out.println("No of Books" + bookRepository.count());
        System.out.println("No of Publisher" + publisherRepository.count());
        System.out.println("no of publisherd book size "+ oxford.getBooks().size());
    }
}
