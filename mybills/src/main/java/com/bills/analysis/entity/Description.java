package com.bills.analysis.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "description")
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "explanation", nullable = false)
    private String explanation;
    @Temporal(TemporalType.DATE)
    private Date lastPaymentDate;
    @Column(name = "number", nullable = false)
    private int number;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "description", targetEntity = Bills.class)
    private Set bills = new HashSet<>();
    @OneToOne(fetch = FetchType.EAGER)
    private Institution institution;
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

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Description{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", explanation='" + explanation + '\'' +
            ", lastPaymentDate=" + lastPaymentDate +
            ", plambingNumber=" + number +
            '}';
    }
}
