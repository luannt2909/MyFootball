package Model;

/**
 * Created by Nguyen Tan Luan on 1/11/2017.
 */

public class StatisticPlayer {
    private String STT;
    private int avatar;
    private String name;
    private int logo;
    private String teamname;
    private String value;

    public StatisticPlayer(String STT, int avatar, String name, int logo, String teamname, String value) {
        this.STT = STT;
        this.avatar = avatar;
        this.name = name;
        this.logo = logo;
        this.teamname = teamname;
        this.value = value;
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
