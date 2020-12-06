package com.wcy.dp.cor;

/**
 * 责任链模式
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
