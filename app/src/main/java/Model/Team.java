package Model;

/**
 * Created by Nguyen Tan Luan on 11/21/2016.
 */

public class Team {
    private int STT;
    private int logo;
    private String name;
    private int column1;
    private int colomn2;
    private int column3;

    public Team() {
    }

    public Team(int logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public Team(int STT, String name, int column1, int colomn2, int column3) {
        this.STT = STT;
        this.name = name;
        this.column1 = column1;
        this.colomn2 = colomn2;
        this.column3 = column3;
    }

    public Team(int STT, int logo, String name, int column1, int colomn2, int column3) {
        this.STT = STT;
        this.logo = logo;
        this.name = name;
        this.column1 = column1;
        this.colomn2 = colomn2;
        this.column3 = column3;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    public int getColomn2() {
        return colomn2;
    }

    public void setColomn2(int colomn2) {
        this.colomn2 = colomn2;
    }

    public int getColumn3() {
        return column3;
    }

    public void setColumn3(int column3) {
        this.column3 = column3;
    }
}
