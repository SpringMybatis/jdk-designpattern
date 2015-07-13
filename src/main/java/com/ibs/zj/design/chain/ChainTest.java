package com.ibs.zj.design.chain;

public class ChainTest {

	public static void main(String[] args) {
		// 需要被过滤的语句
		String msg = "被就业了：），敏感信息，<script>";
		// 创建Request、Response对象
		Request req = new Request();
		Response resp = new Response();
		req.setRequestMsg(msg);
		resp.setResponseMsg("response");
		// 搞一个过滤链，链上有两个过滤器
		FilterChain chain = new FilterChain();
		chain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
		// 开始过滤
		chain.doFilter(req, resp);
		System.out.println(req.getRequestMsg());
		System.out.println(resp.getResponseMsg());
	}

}
