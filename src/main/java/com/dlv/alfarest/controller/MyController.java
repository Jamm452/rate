package com.dlv.alfarest.controller;


import com.dlv.alfarest.service.GifSelection;
import com.dlv.alfarest.service.GifService;
import com.dlv.alfarest.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class MyController {

    String YESTERDAY = LocalDate.now().minusDays(1L)
            .format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));

    @Autowired
    private RateService rateService;

    @Autowired
    private GifService gifService;

    @GetMapping("/show/{base}&{second}")
    public String show(
            @PathVariable String base,
            @PathVariable String second,
            Model model) {
        Map<String, Double> latestRates =
                rateService.getLatestRates().getRates();
        Map<String, Double> yesterdayRates =
                rateService.getHistoricalRates(YESTERDAY).getRates();
        double today = latestRates.get(second.toUpperCase());
        double yesterday = yesterdayRates.get(second.toUpperCase());
        String result = GifSelection.result(today, yesterday);
        Object gif = gifService
                .getGif(result)
                .getData()
                .getImages()
                .getOriginal()
                .get("url");
        model.addAttribute("gif", gif);
        return "main";
    }
}