package SocialNetwwork.DB;


public class DB {
    private final String nekName;
    private final String userName;
    private final String title;
    private final String despription;
    private final int likeCount;
    private final int disLikeCount;

    public DB(String nekName, String userName, String title, String despription, int likeCount, int disLikeCount) {
        this.nekName = nekName;
        this.userName = userName;
        this.title = title;
        this.despription = despription;
        this.likeCount = likeCount;
        this.disLikeCount = disLikeCount;
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
