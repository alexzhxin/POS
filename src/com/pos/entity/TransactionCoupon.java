package com.pos.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by alexandrenguyen on 25/12/14.
 */
public class TransactionCoupon {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String coupon_transaction_type;

    @Column
    private Transaction transaction;

    @Column
    private BigDecimal amount;

    @Column
    private String registry_number;

    @Column
    private Product only_product;

    @Column
    private boolean is_convertible;

    @Column
    private Store store;

    @Column
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCoupon_transaction_type() {
        return coupon_transaction_type;
    }

    public void setCoupon_transaction_type(String coupon_transaction_type) {
        this.coupon_transaction_type = coupon_transaction_type;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIs_convertible() {
        return is_convertible;
    }

    public void setIs_convertible(boolean is_convertible) {
        this.is_convertible = is_convertible;
    }

    public Product getOnly_product() {
        return only_product;
    }

    public void setOnly_product(Product only_product) {
        this.only_product = only_product;
    }

    public String getRegistry_number() {
        return registry_number;
    }

    public void setRegistry_number(String registry_number) {
        this.registry_number = registry_number;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
