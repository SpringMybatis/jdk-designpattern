package com.ibs.zj.design.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	// 过滤器集合
	private List<Filter> filters = new ArrayList<Filter>();
	
	// 调用链上的过滤器时，记录过滤器的位置用
	private int index = 0;

	/**
	 * 添加过滤器
	 * 
	 * @param f
	 * @return
	 */
	public FilterChain addFilter(Filter f) {
		filters.add(f);
		return this;
	}

	/**
	 * 执行过滤
	 * 
	 * @param req
	 * @param resp
	 */
	public void doFilter(Request req, Response resp) {
		if (index == filters.size())
			return;
		// 得到当前过滤器
		Filter f = filters.get(index);
		index++;
		f.doFilter(req, resp, this);
	}

}
