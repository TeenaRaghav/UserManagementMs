package com.tekarch.UserManagementMS.Models;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {
    // Default constructor
    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference//@JsonManagedReference tells Jackson to include the serialized list of accounts when serializing the User object.
    private List<Account> linkedAccounts;

    @Column(nullable = false)
    private boolean kycVerified = false;

    // Constructor with parameters

    public User(Long id, String username, String password, String email, String firstName, String lastName, LocalDate dateOfBirth, String phone, List<Account> linkedAccounts, boolean kycVerified) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.linkedAccounts = linkedAccounts;
        this.kycVerified = kycVerified;
    }
}

