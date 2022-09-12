package com.example.mdays;

public class Record {
    private Integer id;
    private String titleName;
    private String typeName;
    private String textBody;
    private String createTime;
    private String noticeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", titleName='" + titleName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", textBody='" + textBody + '\'' +
                ", createTime='" + createTime + '\'' +
                ", noticeTime='" + noticeTime + '\'' +
                '}';
    }
}