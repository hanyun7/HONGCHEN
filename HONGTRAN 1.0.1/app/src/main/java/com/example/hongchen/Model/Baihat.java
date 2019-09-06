package com.example.hongchen.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Baihat {

    @SerializedName("IdBaiHat")
    @Expose
    private String idBaiHat;
    @SerializedName("IdAlbum")
    @Expose
    private String idAlbum;
    @SerializedName("IdTheLoai")
    @Expose
    private String idTheLoai;
    @SerializedName("IdPlayList")
    @Expose
    private String idPlayList;
    @SerializedName("TenBaiHat")
    @Expose
    private String tenBaiHat;
    @SerializedName("HinhBaiHat")
    @Expose
    private String hinhBaiHat;
    @SerializedName("CaSi")
    @Expose
    private String caSi;
    @SerializedName("LinkBaiHat")
    @Expose
    private String linkBaiHat;
    @SerializedName("LuotThich")
    @Expose
    private String luotThich;

    public String getIdBaiHat() {
    return idBaiHat;
    }

    public void setIdBaiHat(String idBaiHat) {
    this.idBaiHat = idBaiHat;
    }

    public String getIdAlbum() {
    return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
    this.idAlbum = idAlbum;
    }

    public String getIdTheLoai() {
    return idTheLoai;
    }

    public void setIdTheLoai(String idTheLoai) {
    this.idTheLoai = idTheLoai;
    }

    public String getIdPlayList() {
    return idPlayList;
    }

    public void setIdPlayList(String idPlayList) {
    this.idPlayList = idPlayList;
    }

    public String getTenBaiHat() {
    return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
    this.tenBaiHat = tenBaiHat;
    }

    public String getHinhBaiHat() {
    return hinhBaiHat;
    }

    public void setHinhBaiHat(String hinhBaiHat) {
    this.hinhBaiHat = hinhBaiHat;
    }

    public String getCaSi() {
    return caSi;
    }

    public void setCaSi(String caSi) {
    this.caSi = caSi;
    }

    public String getLinkBaiHat() {
    return linkBaiHat;
    }

    public void setLinkBaiHat(String linkBaiHat) {
    this.linkBaiHat = linkBaiHat;
    }

    public String getLuotThich() {
    return luotThich;
    }

    public void setLuotThich(String luotThich) {
    this.luotThich = luotThich;
    }

}