package edu.mum.repositoryimpl;

import edu.mum.domain.Calculation;
import edu.mum.repository.CalculationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CalculationRepositoryImpl implements CalculationRepository {

    private List<Calculation> calculations;


    public List<Calculation> getAll() {
        return calculations;
    }


    public void save(Calculation calculation) {

        calculations.add(calculation);
        return;
    }
}
