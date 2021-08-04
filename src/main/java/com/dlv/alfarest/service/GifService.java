package com.dlv.alfarest.service;

import com.dlv.alfarest.model.Giphy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GifService", url = "${giphy.url}")
public interface GifService {

    @GetMapping("?api_key=" + "${giphy.pass}" + "&tag=" + "{string}" + "&rating=g")
    Giphy getGif(@PathVariable() String string);
}