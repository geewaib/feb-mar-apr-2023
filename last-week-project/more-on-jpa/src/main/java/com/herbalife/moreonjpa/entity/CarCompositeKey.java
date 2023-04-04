package com.herbalife.moreonjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Embeddable
public class CarCompositeKey implements Serializable {
    @Id
    @Column(name = "chassis_no")
    private String chassisNo;

    @Id
    private String model;
}
