package Model;

/**
 * Created by Nguyen Tan Luan on 11/16/2016.
 */

public class News {
    private int idImage;
    private String content;
    private String author;
    private String time;
    private int like;
    private int comment;
    private int share;

    public News() {
    }

    public News(int idImage, String content, String author, String time) {
        this.idImage = idImage;
        this.content = content;
        this.author = author;
        this.time = time;
    }

    public News(int idImage, String content, String author, String time, int like, int comment, int share) {
        this.idImage = idImage;
        this.content = content;
        this.author = author;
        this.time = time;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
