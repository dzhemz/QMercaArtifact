package com.QMerca.QMercaArtifact.entities;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.sql.Timestamp;


@Entity
@Getter
@ToString
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Worker worker;
    @ManyToOne
    private Client client;
    @ManyToOne
    private OrderStatus status;

    @OneToMany OrderStrings strings;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timestampOfCreation;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timestampOfExecuteOrder;
}
