package com.skyros.demo.vo;

import java.math.BigDecimal;

public class CurrencyVO {

    private String from;
    private String to;
    private BigDecimal quantity;
    private String tag;

    public CurrencyVO() {
    }

    public CurrencyVO(String from, String to, BigDecimal quantity, String tag) {
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.tag = tag;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
