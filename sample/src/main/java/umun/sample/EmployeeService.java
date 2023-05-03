package umun.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
    private EmployeeRepo repo;
public Iterable<Employee> listAll(){
    return this.repo.findAll();
}

public void saveOrUpload(Employee employees){
    repo.save(employees);
}

}
