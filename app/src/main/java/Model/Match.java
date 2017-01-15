package Model;

/**
 * Created by Nguyen Tan Luan on 11/27/2016.
 */

public class Match {
    private String hostTeam;
    private String guestTeam;
    private String tiso;
    private String timestart;
    private boolean isFinish;

    public int getLeague() {
        return league;
    }

    public void setLeague(int league) {
        this.league = league;
    }

    private int league;


    public Match() {
    }

    public Match(String hostTeam, String guestTeam, String tiso, String timestart, boolean isFinish, int league) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.tiso = tiso;
        this.timestart = timestart;
        this.isFinish = isFinish;
        this.league = league;
    }

    public Match(String hostTeam, String guestTeam, String tiso, String timestart, int league) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.tiso = tiso;
        this.timestart = timestart;
        this.league = league;
    }

    public Match(String hostTeam, String guestTeam, String tiso, String timestart) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.tiso = tiso;
        this.timestart = timestart;
    }

    public Match(String hostTeam, String guestTeam, String timestart) {
        this.hostTeam = hostTeam;
        this.guestTeam = guestTeam;
        this.timestart = timestart;
        this.tiso=" - ";
    }

    public String getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(String hostTeam) {
        this.hostTeam = hostTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }

    public String getTiso() {
        return tiso;
    }

    public void setTiso(String tiso) {
        this.tiso = tiso;
    }

    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
