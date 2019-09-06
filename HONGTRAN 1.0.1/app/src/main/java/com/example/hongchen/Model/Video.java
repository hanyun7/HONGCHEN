package com.example.hongchen.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("IdVideo")
    @Expose
    private String idVideo;
    @SerializedName("TenVideo")
    @Expose
    private String tenVideo;
    @SerializedName("HinhVideo")
    @Expose
    private String hinhVideo;
    @SerializedName("LinkVideo")
    @Expose
    private String linkVideo;
    @SerializedName("TacGia")
    @Expose
    private String tacGia;

    public String getIdVideo() {
    return idVideo;
    }

    public void setIdVideo(String idVideo) {
    this.idVideo = idVideo;
    }

    public String getTenVideo() {
    return tenVideo;
    }

    public void setTenVideo(String tenVideo) {
    this.tenVideo = tenVideo;
    }

    public String getHinhVideo() {
    return hinhVideo;
    }

    public void setHinhVideo(String hinhVideo) {
    this.hinhVideo = hinhVideo;
    }

    public String getLinkVideo() {
    return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
    this.linkVideo = linkVideo;
    }

    public String getTacGia() {
    return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
}