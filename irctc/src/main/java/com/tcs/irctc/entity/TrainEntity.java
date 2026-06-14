package com.tcs.irctc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "train_data")
@Data
public class TrainEntity {

    @Id
    @Column(name = "train_no")
    private int trainNo;

    @Column(name = "train_name")
    private String trainName;

    @Column(name = "src")
    private String src;

    @Column(name = "dest")
    private String dest;

    @Column(name = "time")
    private String time;
}