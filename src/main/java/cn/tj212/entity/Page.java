package cn.tj212.entity;

import java.util.List;

public class Page<T> {
    private static final int PAGESIZE=10;
    private int totalPage;
    private int totalRecords;
    private List<T> data;

    public static int getPAGESIZE() {
        return PAGESIZE;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
