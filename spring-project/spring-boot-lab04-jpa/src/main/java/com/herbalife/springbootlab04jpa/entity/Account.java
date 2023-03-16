package com.herbalife.springbootlab04jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @Column(name = "account_number")
    private String accountNumber;
    @Column
    private String owner;
    @Column
    private int balance;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_number")
    private List<Statement> statements;
}
