package com.bills.analysis.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Bills", indexes = {
    @Index(name = "ıdx_bills_amount_billyear", columnList = "amount, billYear, paymentDate, paymentMonth"),
    @Index(name = "ıdx_bills_amount", columnList = "amount"),
    @Index(name = "ıdx_bills_billyear", columnList = "billYear"),
    @Index(name = "ıdx_bills_paymentdate", columnList = "paymentDate"),
    @Index(name = "ıdx_bills_paymentmonth", columnList = "paymentMonth")
})
public class Bills {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "amount", nullable = false, precision = 0, scale = 15)
    private double amount;
    @Column(name = "billYear", nullable = false)
    private Integer billYear;
    @Temporal(TemporalType.DATE)
    @Column(name = "paymentDate", nullable = false)
    private Date paymentDate;
    @Column(name = "paymentMonth", nullable = false)
    private Months months;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER,targetEntity = Description.class)
    @JoinColumn(name = "description_id", nullable = false, foreignKey = @ForeignKey(name = "fk_description", value = ConstraintMode.CONSTRAINT))
    private Description description;

    public Bills() {
    }

    public Bills(Long id, double amount, Integer billYear, Date paymentDate, Months months) {
        this.id = id;
        this.amount = amount;
        this.billYear = billYear;
        this.paymentDate = paymentDate;
        this.months = months;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getBillYear() {
        return billYear;
    }

    public void setBillYear(Integer billYear) {
        this.billYear = billYear;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "Bills{" +
            "id=" + id +
            ", amount=" + amount +
            ", billYear=" + billYear +
            ", paymentDate=" + paymentDate +
            ", months=" + months +
            '}';
    }
}
