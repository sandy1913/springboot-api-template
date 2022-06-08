package com.dcs.prototype.model;


import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "sar_experiment_details_norm")
@lombok.Data
public class Data {
    @Id
    private BigInteger resultId;

    @Column(name="load_date")
    private String loadDate;

    @Column(name="summary_group_id", nullable= false)
    private BigInteger summaryGroupId;

    @Column(name="compound_number")
    private String compoundNumber;


}
