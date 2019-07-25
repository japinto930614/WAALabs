package edu.mum.domain;

import java.io.Serializable;

public class Calculation implements Serializable {
    private static final long serialVersionUID = 748392348L;
    private Integer addend1;
    private Integer addend2;
    private Integer sum;
    private Integer multiplicand;
    private Integer multiplier;
    private Integer product;

    public Integer getAddend1() {
        return addend1;
    }

    public void setAddend1(Integer addend1) {
        this.addend1 = addend1;
    }

    public Integer getAddend2() {
        return addend2;
    }

    public void setAddend2(Integer addend2) {
        this.addend2 = addend2;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(Integer multiplicand) {
        this.multiplicand = multiplicand;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }
}
