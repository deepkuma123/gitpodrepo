package umun.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@Autowired
    private EmployeeService service;

@GetMapping("/")
    private Iterable<Employee>getEmployee()
    {
    return service.listAll();
    }
    @PostMapping(name = "/save")
    private long saveBook(@RequestBody Employee employees){
    service.saveOrUpload(employees);
    return employees.getId();
    }
}
