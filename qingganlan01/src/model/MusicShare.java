package model;

public class MusicShare {
    private String usId;

    private String musicId;

    private String musicName;

    private String musicPerson;

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId == null ? null : usId.trim();
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId == null ? null : musicId.trim();
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public String getMusicPerson() {
        return musicPerson;
    }

    public void setMusicPerson(String musicPerson) {
        this.musicPerson = musicPerson == null ? null : musicPerson.trim();
    }
}