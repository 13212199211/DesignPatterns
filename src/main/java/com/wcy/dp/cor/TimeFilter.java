package com.wcy.dp.cor;

import java.util.Date;

public class TimeFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("start time" + new Date().toString());
        filterChain.doFilter(request, response);
        System.out.println("end time" + new Date().toString());
    }
}
