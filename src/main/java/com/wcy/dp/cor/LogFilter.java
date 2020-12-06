package com.wcy.dp.cor;

public class LogFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("start log");
        filterChain.doFilter(request, response);
        System.out.println("end log");
    }
}
