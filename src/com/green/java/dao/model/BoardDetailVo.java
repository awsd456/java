package com.green.java.dao.model;

public class BoardDetailVo {

    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String mainPic;
    private String createdAt;

    public BoardDetailVo(int iboard, String title, String ctnt, String writer, String mainPic, String createdAt) {
        this.iboard = iboard;
        this.title = title;
        this.ctnt = ctnt;
        this.writer = writer;
        this.mainPic = mainPic;
        this.createdAt = createdAt;
    }

    public int getIboard() {
        return iboard;
    }

    public String getTitle() {
        return title;
    }

    public String getCtnt() {
        return ctnt;
    }

    public String getWriter() {
        return writer;
    }

    public String getMainPic() {
        return mainPic;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString(){
        return String.format("iboard:%d ,title:%s ,ctnt:%s ,writer:%s ,mainPic:%s ,createdAt:%s",iboard,title,ctnt,writer,mainPic,createdAt);
    }
}
