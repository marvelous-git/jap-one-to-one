package zw.co.econet.jpaonetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.econet.jpaonetoone.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
