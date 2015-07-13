package com.ibs.zj.design.chain;

public class HtmlFilter implements Filter {

	public void doFilter(Request req, Response resp, FilterChain chain) {
		// 过滤req.reqStr中的HTML标记
		String msg = req.getRequestMsg().replace("<", "&lt;")
				.replace(">", "&gt;")
				+ "---HtmlFilter()---";
		req.setRequestMsg(msg);
		chain.doFilter(req, resp);
		resp.setResponseMsg("---HtmlFilter()---");

	}

}
