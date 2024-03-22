package com.bills.analysis.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;


import java.util.Date;

@Entity
@Table(name = "Bills")
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
