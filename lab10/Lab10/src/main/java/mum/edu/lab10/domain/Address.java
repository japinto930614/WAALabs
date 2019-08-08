package mum.edu.lab10.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDR_ID")
    private Long id;

    private String street;

//    @OneToOne(mappedBy = "address")
//    private Employee employee;

//    @ManyToOne
//        @JoinTable(
//            name = "employee_address",
//            joinColumns = {@JoinColumn(name = "E_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "A_ID")}
//    )
//    private Employee emp;

//    @ManyToMany(mappedBy = "addressList")
//    @ManyToMany(mappedBy = "addressList")
//
//    private List<Employee> employeeList;
}
