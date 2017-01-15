package Model;

/**
 * Created by Nguyen Tan Luan on 12/2/2016.
 */

public class Highlight {
    private int minutes;
    private int whatevent;
    private int eventcount;
    private String name_1;
    private int event_1;
    private String name_2;
    private int event_2;

    public Highlight() {
    }

    public int getEventcount() {
        return eventcount;
    }

    public void setEventcount(int eventcount) {
        this.eventcount = eventcount;
    }

    public Highlight(int minutes, int whatevent, int eventcount, String name_1, int event_1, String name_2, int event_2) {
        this.minutes = minutes;
        this.whatevent = whatevent;
        this.eventcount = eventcount;
        this.name_1 = name_1;
        this.event_1 = event_1;
        this.name_2 = name_2;
        this.event_2 = event_2;
    }

    public Highlight(int minutes, String name_1, int event_1) {
        this.minutes = minutes;
        this.name_1 = name_1;
        this.event_1 = event_1;
    }


    public Highlight(int minutes, int whatevent, String name_1, int event_1, String name_2, int event_2) {
        this.minutes = minutes;
        this.whatevent = whatevent;
        this.name_1 = name_1;
        this.event_1 = event_1;
        this.name_2 = name_2;
        this.event_2 = event_2;
    }

    public Highlight(int minutes, int whatevent, String name_1, int event_1) {
        this.minutes = minutes;
        this.whatevent = whatevent;
        this.name_1 = name_1;
        this.event_1 = event_1;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getWhatevent() {
        return whatevent;
    }

    public void setWhatevent(int whatevent) {
        this.whatevent = whatevent;
    }

    public String getName_1() {
        return name_1;
    }

    public void setName_1(String name_1) {
        this.name_1 = name_1;
    }

    public int getEvent_1() {
        return event_1;
    }

    public void setEvent_1(int event_1) {
        this.event_1 = event_1;
    }

    public String getName_2() {
        return name_2;
    }

    public void setName_2(String name_2) {
        this.name_2 = name_2;
    }

    public int getEvent_2() {
        return event_2;
    }

    public void setEvent_2(int event_2) {
        this.event_2 = event_2;
    }
}
