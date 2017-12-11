package vk.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vk.springframework.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
