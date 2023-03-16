package com.herbalife.springbootlab04jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(exclude = "account")
@Entity
@Table(name = "account_statements")
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String type;
    @Column
    private int amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_number")
    private Account account;
}

