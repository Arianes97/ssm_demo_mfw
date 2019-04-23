package com.chixing.util;

public  class PageHelperUtil {

    /***
     * 每页显示3条记录 pageSize
     * 共有多少条记录 totalRecords
     * 共有几页 totalPage
     * 当前页面 currentPage
     * 从第几条记录开始 startNo: (currentPage-1)*pageSize
     */

    static public final int pageSize = 5; //每页显示5条记录
    private int totalRecords;  // 共有多少条记录
    private int totalPage; //数据库中查的
    private int currentPage;   //当前页面，从网页传来的
    private int startNo ;    //startNo

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalRecords() {
        return totalRecords;
    }
    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getStartNo() {
        return startNo;
    }
    public void setStartNo(int startNo) {
        this.startNo = startNo;
    }

}
