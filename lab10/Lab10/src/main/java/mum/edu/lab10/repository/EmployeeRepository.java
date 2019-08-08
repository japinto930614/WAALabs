package mum.edu.lab10.repository;

import mum.edu.lab10.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByLastName(String lastName);

    @Query("select e from Employee e where e.id = :id")
    List<Employee> locateOneEmployeeByHisNumber(@Param("id") long id);
}
