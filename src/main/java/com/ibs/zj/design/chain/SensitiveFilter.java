package com.ibs.zj.design.chain;

public class SensitiveFilter implements Filter {

	public void doFilter(Request req, Response resp, FilterChain chain) {
		String msg = req.getRequestMsg().replace("敏感", "").replace("被就业", "就业")
				+ "===SensitiveFilter";
		req.setRequestMsg(msg);
		chain.doFilter(req, resp);
		resp.setResponseMsg("===SensitiveFilter");
	}

}
