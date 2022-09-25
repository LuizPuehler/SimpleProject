package com.example.SimpleProject.model.person;

import com.example.SimpleProject.model.address.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String colorFavourite;

    @Column
    private Double height;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> address;

    public Person(Long id, String name, String lastName, String colorFavourite, Double height) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.colorFavourite = colorFavourite;
        this.height = height;
        address = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getColorFavourite() {
        return colorFavourite;
    }

    public void setColorFavourite(String colorFavourite) {
        this.colorFavourite = colorFavourite;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void addAddress(Address address) {
        this.address.add(address);
    }

    public void removeAddress(Address address) {
        this.address.remove(address);
    }
}
