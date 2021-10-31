package com.supconit.study.i18n.controller;

import javafx.scene.chart.ValueAxis;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Locale;

@RestController
@RequestMapping(value = "/i18n")
public class I18nController {

    @Resource
    private MessageSource messageSource;

    @GetMapping(value = "/**")
    public String index(String lang) {

        Locale locale = null;
        if ("zh".equals(lang)) {
            locale = Locale.ITALY;
        } else if ("en".equals(lang)) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.CANADA;
        }

        return messageSource.getMessage("name", null, locale);

    }
}
