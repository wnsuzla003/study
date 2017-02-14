package remind.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import remind.Model.Question;

public interface QnaRepository extends JpaRepository<Question, Long> {

}
