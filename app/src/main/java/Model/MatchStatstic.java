package Model;

/**
 * Created by Nguyen Tan Luan on 1/9/2017.
 */

public class MatchStatstic {
    private String title;
    private String index1;
    private int value1;
    private String index2;
    private int value2;

    public MatchStatstic() {
    }

    public MatchStatstic(String title, String index1, int value1, String index2, int value2) {
        this.title = title;
        this.index1 = index1;
        this.value1 = value1;
        this.index2 = index2;
        this.value2 = value2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex1() {
        return index1;
    }

    public void setIndex1(String index1) {
        this.index1 = index1;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public String getIndex2() {
        return index2;
    }

    public void setIndex2(String index2) {
        this.index2 = index2;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
