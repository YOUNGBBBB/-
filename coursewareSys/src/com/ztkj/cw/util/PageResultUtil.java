package com.ztkj.cw.util;

import java.util.List;

public class PageResultUtil<T> {
	// 当前页
	private int currPage;
	// 每页显示的数据条数
	private int pageSize = 6;
	// 最大页数
	private int totalPage;
	// 数据的总条数
	private int count;
	// 查询结果
	private List<T> results;
	
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		this.totalPage = 
				count % this.pageSize == 0 ? count / this.pageSize : count / this.pageSize + 1;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	
}
