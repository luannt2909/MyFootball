package Model;

/**
 * Created by Nguyen Tan Luan on 11/16/2016.
 */

public class Video {
    private int imgID;
    private String content;
    private int views;
    private int share;

    public Video() {
    }

    public Video(int imgID, String content, int views, int share) {
        this.imgID = imgID;
        this.content = content;
        this.views = views;
        this.share = share;
    }

    public Video(int imgID, String content) {
        this.imgID = imgID;
        this.content = content;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
