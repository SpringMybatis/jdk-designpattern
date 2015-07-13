package com.ibs.zj.design.chain;

public interface Filter {

	public void doFilter(Request req,Response resp,FilterChain chain); 
	
}
