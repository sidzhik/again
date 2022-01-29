package repository;

import com.example.again.models.Books;
import org.springframework.data.repository.CrudRepository;


// interfejs dla implementcacji CRUD dzieku dziedziczeniu po interfejsie CrudRepository (Create Read Update Delete)

public interface BooksRepository extends CrudRepository <Books, Long /*typ danych KLUCZA*/>{

}
