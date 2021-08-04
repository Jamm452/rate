package com.dlv.alfarest.service;

import com.dlv.alfarest.model.Rate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RateService", url = "${rates.url}")
public interface RateService {

    @GetMapping("latest.json?app_id=${rates.pass}")
    Rate getLatestRates();

    @GetMapping("latest.json?app_id=${rates.pass}&base={value}")
    Rate getLatestRates(@PathVariable("value") String value);

    @GetMapping("historical/{date}.json?app_id=${rates.pass}")
    Rate getHistoricalRates(@PathVariable("date") String yesterday);
}