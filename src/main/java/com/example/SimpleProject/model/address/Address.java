package com.example.SimpleProject.model.address;

import com.example.SimpleProject.model.person.Person;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private Integer number;

    @Column
    private String neighborhood;

    @Column
    private String state;

    @Column
    private String street;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Address(Long id, String cep, String neighborhood, String state, String street, Person person, Integer number) {
        this.id = id;
        this.cep = cep;
        this.neighborhood = neighborhood;
        this.state = state;
        this.street = street;
        this.person = person;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
