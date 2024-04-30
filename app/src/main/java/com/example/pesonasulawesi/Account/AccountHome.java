package com.example.pesonasulawesi.Account;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class AccountHome implements Parcelable {

    private String fullname, username, caption;
    private Integer profile, post, story;

    public AccountHome(String fullname, String username, Integer profile, Integer post , String caption, Integer story) {
        this.fullname = fullname;
        this.username = username;
        this.profile = profile;
        this.post = post;
        this.caption = caption;
        this.story = story;
    }

    protected AccountHome(Parcel in) {
        fullname = in.readString();
        username = in.readString();
        caption = in.readString();
        if (in.readByte() == 0) {
            profile = null;
        } else {
            profile = in.readInt();
        }
        if (in.readByte() == 0) {
            post = null;
        } else {
            post = in.readInt();
        }
        if (in.readByte() == 0) {
            story = null;
        } else {
            story = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullname);
        dest.writeString(username);
        dest.writeString(caption);
        if (profile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile);
        }
        if (post == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post);
        }
        if (story == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(story);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AccountHome> CREATOR = new Creator<AccountHome>() {
        @Override
        public AccountHome createFromParcel(Parcel in) {
            return new AccountHome(in);
        }

        @Override
        public AccountHome[] newArray(int size) {
            return new AccountHome[size];
        }
    };

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getStory() {
        return story;
    }

    public void setStory(Integer story) {
        this.story = story;
    }

}
