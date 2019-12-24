package com.onlineshop.utils;

import java.util.List;

/**
 * @author JunedQQ
 * @create 2019/12/24
 * @since 1.0.0
 * 分页工具类对象
 */
public class Page<T> {

    private int totalCount; //总记录数
    private int currentPage; //当前页码数
    private int totalPage; //总页码数
    private List<T> rowsList; //当前页码数的数据
    private int rows; //每页显示的条数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getRowsList() {
        return rowsList;
    }

    public void setRowsList(List<T> rowsList) {
        this.rowsList = rowsList;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Page{" +
                "totalCount=" + totalCount +
                ", currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", rowsList=" + rowsList +
                ", rows=" + rows +
                '}';
    }
}