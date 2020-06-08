package zw.co.econet.jpaonetoone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.econet.jpaonetoone.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
