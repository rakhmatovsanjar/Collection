package SocialNetwwork.Data;

public class VideoData {
    private final String title;
    private final String despription;
    private int likeCount;
    private int disLikeCount;

    public VideoData(String title, String despription) {
        this.title = title;
        this.despription = despription;
    }

    public String getTitle() {
        return title;
    }

    public String getDespription() {
        return despription;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getDisLikeCount() {
        return disLikeCount;
    }

    public void setLikeCount() {
        likeCount++;
    }
    public void setDisLikeCount(){
        disLikeCount++;
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", despription='" + despription + '\'' +
                ", likeCount=" + likeCount +
                ", disLikeCount=" + disLikeCount +
                '}';
    }
}
