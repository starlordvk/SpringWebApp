package vk.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import vk.springframework.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
