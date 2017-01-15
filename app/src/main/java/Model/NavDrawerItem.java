package Model;

/**
 * Created by Nguyen Tan Luan on 11/16/2016.
 */

public class NavDrawerItem {
    private boolean showNotify;
    private int resID;
    private String title;


    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title,int resID) {
        this.showNotify = showNotify;
        this.resID=resID;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
