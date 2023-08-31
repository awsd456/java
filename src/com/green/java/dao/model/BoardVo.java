package com.green.java.dao.model;

public class BoardVo {

    private int iboard;
    private String title;
    private String createdAt;
    private String writer;
    private String mainPic;

    public BoardVo(int iboard, String title, String createdAt, String writer, String mainPic) {
        this.iboard = iboard;
        this.title = title;
        this.createdAt = createdAt;
        this.writer = writer;
        this.mainPic = mainPic;
    }

    public int getIboard() {
        return iboard;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getWriter() {
        return writer;
    }

    public String getMainPic() {
        return mainPic;
    }

    @Override
    public String toString(){
        return String.format("iboard:%d,title:%s,createdAt:%s,writer:%s,mainPic:%s\n",iboard,title,createdAt,writer,mainPic);
    }
}
