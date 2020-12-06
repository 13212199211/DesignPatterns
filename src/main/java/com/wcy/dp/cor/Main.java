package com.wcy.dp.cor;

public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.add(new LogFilter()).add(new TimeFilter());
        Request request = new Request("this is a request");
        Response response = new Response("this is a response");
        filterChain.doFilter(request, response);
    }
}
