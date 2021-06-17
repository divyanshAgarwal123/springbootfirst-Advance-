package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.domain.Imploy;

@Repository
public interface EmployeeRepository extends JpaRepository<Imploy,Integer> {

}
