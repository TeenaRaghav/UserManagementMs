package com.tekarch.UserManagementMS.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private String accountType; // e.g., Savings, Joint, External

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference//@JsonBackReference tells Jackson not to serialize the User field in Account, preventing infinite recursion.
    private User user;

   }
