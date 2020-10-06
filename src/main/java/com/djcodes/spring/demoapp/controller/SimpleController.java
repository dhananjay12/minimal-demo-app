package com.djcodes.spring.demoapp.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class SimpleController {

    @RequestMapping(value = {"/headers"})
    @ResponseBody
    public Map<String, Map<String, String>> headers(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Map<String, String>> headers = new HashMap<>();

        if (request != null && request.getHeaderNames() != null) {
            Map<String, String> requestHeaders = new HashMap<>();

            headers.put("request", requestHeaders);
            Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                requestHeaders.put(headerName, request.getHeader(headerName));
            }
        }

        if (response != null && response.getHeaderNames() != null) {
            Map<String, String> responseHeaders = new HashMap<>();

            headers.put("response", responseHeaders);
            for (String headerName : response.getHeaderNames()) {
                responseHeaders.put(headerName, response.getHeader(headerName));
            }
        }

        return headers;
    }

}
