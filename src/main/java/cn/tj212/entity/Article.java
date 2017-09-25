package cn.tj212.entity;

import java.util.Date;

public class Article {
    private String id;
    private String author;
    private Date postDate;
    private String title;
    private String content;
    private String digest;
    private String status;
    private String commentStatus;
    private String pingStatus;
    private String artiPassword;
    private String artiName;
    private String toPing;
    private String pinged;
    private Date modified;
    private Date modifiedGmt;
    private String contentFiltered;
    private String artiParent;
    private String guid;
    private Integer menuOrder;
    private String artiType;
    private String mimeType;
    private Long commentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getArtiPassword() {
        return artiPassword;
    }

    public void setArtiPassword(String artiPassword) {
        this.artiPassword = artiPassword;
    }

    public String getArtiName() {
        return artiName;
    }

    public void setArtiName(String artiName) {
        this.artiName = artiName;
    }

    public String getToPing() {
        return toPing;
    }

    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    public String getPinged() {
        return pinged;
    }

    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(Date modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getContentFiltered() {
        return contentFiltered;
    }

    public void setContentFiltered(String contentFiltered) {
        this.contentFiltered = contentFiltered;
    }

    public String getArtiParent() {
        return artiParent;
    }

    public void setArtiParent(String artiParent) {
        this.artiParent = artiParent;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getArtiType() {
        return artiType;
    }

    public void setArtiType(String artiType) {
        this.artiType = artiType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}
