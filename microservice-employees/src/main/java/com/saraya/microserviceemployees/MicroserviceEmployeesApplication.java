package com.saraya.microserviceemployees;

import com.saraya.microserviceemployees.models.Employee;
import com.saraya.microserviceemployees.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.time.LocalDate;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceEmployeesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEmployeesApplication.class, args);
    }

    public CommandLineRunner loadData(EmployeeRepository employeeRepository){
        return (args)->{
            //save Employees
            employeeRepository.save(new Employee( null,"Ibrahim","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Abou","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Omar","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Hassan","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Fall","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Dieynaba","Ahamada", LocalDate.now(),"F","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Karim","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Dida","Ahamada", LocalDate.now(),"F","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Sali","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Tomie","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));
            employeeRepository.save(new Employee( null,"Alemeda","Ahamada", LocalDate.now(),"M","12 Avenu","Dakar","Somp","Sénégal","ibra@gmail.com","778236334", 400000.0F,"ibra","ibra@passe"));








        };
    }
}
