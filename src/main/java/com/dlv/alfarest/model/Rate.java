package com.dlv.alfarest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Rate {

    @JsonProperty("rates")
    private Map<String, Double> rates;

    public Rate() {
    }

    public Rate(Map<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "rates=" + rates +
                '}';
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}