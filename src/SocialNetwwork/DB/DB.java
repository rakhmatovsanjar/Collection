package SocialNetwwork.DB;

import SocialNetwwork.Data.VideoData;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private String nekName;
    private String userName;
    private String title;
    private String despription;
    private int likeCount;
    private int disLikeCount;
    private List<VideoData> videoData=new ArrayList<>();

    public DB(String nekName, String userName, String title, String despription, int likeCount, int disLikeCount) {
        this.nekName = nekName;
        this.userName = userName;
        this.title = title;
        this.despription = despription;
        this.likeCount = likeCount;
        this.disLikeCount = disLikeCount;
    }

    public DB(String nekName, String userName, List<VideoData> videoData) {
        this.nekName = nekName;
        this.userName = userName;
        this.videoData = videoData;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DB{" +
                "nekName='" + nekName + '\'' +
                ", userName='" + userName + '\'' +
                ", title='" + title + '\'' +
                ", despription='" + despription + '\'' +
                ", likeCount=" + likeCount +
                ", disLikeCount=" + disLikeCount +
                '}';
    }
}
