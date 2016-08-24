package com.erxi.web.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/**
 * Created by James
 * on 16/8/16.
 * Description: web config class
 */
@EnableWebMvc
public class WebConfigEx extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
        stringHttpMessageConverter.setSupportedMediaTypes(
                Arrays.asList(new MediaType("text", "plain", Charset.forName("UTF-8"))));
        converters.add(stringHttpMessageConverter);
    }
}
