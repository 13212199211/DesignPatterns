package com.wcy.dp.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器责任链，这里不实现filter接口;
 */
public class FilterChain {
    private int index = 0;
    private List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    /**
     * 每次只执行一个filter，实现去时123，回时321
     * @param request
     * @param response
     */
    public void doFilter(Request request, Response response) {
        if (index >= filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index++);
        filter.doFilter(request, response, this);
    }
}
