package Model;

/**
 * Created by Nguyen Tan Luan on 1/14/2017.
 */

public class Player {
    private String name;
    private int avatar;
    private String number;
    private String value;

    public Player(String number, int avatar, String name, String value) {
        this.name = name;
        this.avatar = avatar;
        this.number = number;
        this.value=value;
    }

    public Player(String name, int avatar, String number) {
        this.name = name;
        this.avatar = avatar;
        this.number = number;
    }

    public Player() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
