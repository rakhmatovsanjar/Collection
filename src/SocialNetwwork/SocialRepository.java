package SocialNetwwork;

import SocialNetwwork.DB.DB;
import SocialNetwwork.Data.UserData;
import SocialNetwwork.Data.VideoData;
import SocialNetwwork.Interface.ShowInfoInrterface;
import SocialNetwwork.Interface.ShowMessageInterface;

import java.util.ArrayList;

public class SocialRepository {
    private ShowInfoInrterface showInfoInrterface;
    private ShowMessageInterface showMessageInterface;
    private ArrayList<DB> network = new ArrayList<>();

    private static SocialRepository instanse = null;

    public void setShowInfoInrterface(ShowInfoInrterface showInfoInrterface) {
        this.showInfoInrterface = showInfoInrterface;
    }

    public void setShowMessageInterface(ShowMessageInterface showMessageInterface) {
        this.showMessageInterface = showMessageInterface;
    }

    public void showInfo(){
        System.out.println(network);
    }

    public void addVideo(UserData userData, VideoData videoData) {
        ArrayList<DB> videosToAdd = new ArrayList<>();
                videosToAdd.add(new DB(userData.getNekName(), userData.getUserName(), videoData.getTitle(), videoData.getDespription(), videoData.getLikeCount(), videoData.getDisLikeCount()));
                showMessageInterface.showMessage(videoData.getTitle() + " nomil video " + userData.getNekName() + " foydalanuvchi tomonidan muvaffaqqiyatle qo'shildi!");
        network.addAll(videosToAdd);
    }
    public void removeVideo(UserData userData, VideoData videoData) {
        DB videoToRemove = new DB(userData.getNekName(), userData.getUserName(), videoData.getTitle(), videoData.getDespription(), videoData.getLikeCount(), videoData.getDisLikeCount());
            network.remove(videoToRemove);
            showMessageInterface.showMessage(videoData.getTitle() + " nomil video " + userData.getNekName() + " foydalanuvchi tomonidan muvaffaqqiyatle tarmoqdan o'chirildi!");

    }
    public void likeTheVideo(VideoData videoData){
        videoData.setLikeCount();
    }
    public void disLikeTheVideo(VideoData videoData){
        videoData.setDisLikeCount();
    }

    public  void  getAllVideosByUser(){
        showInfoInrterface.showInfo(new VideoData("",""));
    }

    public static SocialRepository getInstance(){
        if (instanse==null){
            instanse=new SocialRepository();
        }
        return instanse;
    }
}
