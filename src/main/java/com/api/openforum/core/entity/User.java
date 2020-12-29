package com.api.openforum.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="TB_USER")
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="table_id")
    private Long id;

    @Column(name="user_id", nullable = false)
    private UUID userId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="user_alias")
    private String userAlias;

    @Column(name="user_email")
    private String userEmail;
}
