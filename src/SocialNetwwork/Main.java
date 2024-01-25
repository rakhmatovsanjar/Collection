package SocialNetwwork;
import SocialNetwwork.Data.UserData;
import SocialNetwwork.Data.VideoData;

public class Main {
    public static void main(String[] args) {
        UserData userData=new UserData("Sanjek","Sanjarbek");
        VideoData videoData1=new VideoData("Lesson19","ArrayList haqida");
        VideoData videoData2=new VideoData("Lesson20","LinkerList haqida");
        VideoData videoData3=new VideoData("Lesson21","Stack haqida");
        SocialRepository socialRepository= SocialRepository.getInstance();
        socialRepository.setShowMessageInterface(System.out::println);
        socialRepository.addVideo(userData,videoData1);
        socialRepository.addVideo(userData,videoData2);
        socialRepository.addVideo(userData,videoData3);
        socialRepository.removeVideo(userData,videoData2);
        socialRepository.showInfo();
        socialRepository.likeTheVideo(videoData3);
        socialRepository.showInfo();
    }
}
