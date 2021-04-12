package com.badra.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPost {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Post> listDataPost;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Post> getListDataPost() {
        return listDataPost;
    }
    public void setListDataPost(List<Post> listDataPost) {
        this.listDataPost = listDataPost;
    }
}
