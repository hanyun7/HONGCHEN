package com.example.hongchen.Service;

import com.example.hongchen.Model.Baihat;
import com.example.hongchen.Model.ChuDe;
import com.example.hongchen.Model.Kichtruyenthanh;
import com.example.hongchen.Model.Ost;
import com.example.hongchen.Model.Playlist;
import com.example.hongchen.Model.Quangcao;
import com.example.hongchen.Model.Video;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Dataservice {
    @GET("carousel.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("playlistforcurrentday.php")
    Call<List<Playlist>> GetPlaylistforCurrentday();

    @GET("playlistpopular.php")
    Call<List<Playlist>> GetPlaylistPopular();

    @GET("video.php")
    Call<List<Video>> GetVideo();

    @GET("ost.php")
    Call<List<Ost>> GetOst();

    @GET("kichtruyenthanh.php")
    Call<List<Kichtruyenthanh>> GetKichtruyenthanh();

    @GET("chude.php")
    Call<List<ChuDe>> GetChude();

    @GET("baihat.php")
    Call<List<Baihat>> GetBaihat();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaihattheoplaylist(@Field("idplaylist") String idplaylist);

    @GET("danhsachcacplaylist.php")
    Call<List<Playlist>> GetDanhsachcacplaylist();
}
