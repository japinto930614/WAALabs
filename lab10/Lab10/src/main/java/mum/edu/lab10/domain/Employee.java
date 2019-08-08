package mum.edu.lab10.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Identity, Sequence, Table
    private Long id;

    @NotEmpty
    @Column(name = "F_NAME")
    private String firstName;

    @Column(name = "L_NAME", length = 20)
    @NotEmpty
    private String lastName;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;

    public Employee(String firstName, @NotEmpty String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //    @OneToMany(mappedBy = "emp")
//    @JoinTable(
//            name = "employee_address",
//            joinColumns = {@JoinColumn(name = "E_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "A_ID")}
//    )
//    @ManyToMany
//    @JoinTable(
//            name = "employee_address",
//            joinColumns = {@JoinColumn(name = "E_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "A_ID")}
//    )
//    private List<Address> addressList;
}
