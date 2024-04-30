package com.example.pesonasulawesi.Account;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountHistory implements Parcelable {

    private String fullnamehistory, usernamehistory, captionhistory;
    private Integer profilehistory, posthistory;

    private Uri addposthistory;

    public AccountHistory(String fullnamehistory, String usernamehistory, Integer profilehistory, Integer posthistory, String captionhistory) {
        this.fullnamehistory = fullnamehistory;
        this.usernamehistory = usernamehistory;
        this.profilehistory = profilehistory;
        this.posthistory = posthistory;
        this.captionhistory = captionhistory;
    }

    public AccountHistory(String fullnamehistory, String usernamehistory, Integer profilehistory, Uri addposthistory, String captionhistory) {
        this.fullnamehistory = fullnamehistory;
        this.usernamehistory = usernamehistory;
        this.profilehistory = profilehistory;
        this.addposthistory = addposthistory;
        this.captionhistory = captionhistory;
    }

    public String getFullnamehistory() {
        return fullnamehistory;
    }

    public void setFullnamehistory(String fullnamehistory) {
        this.fullnamehistory = fullnamehistory;
    }

    public String getUsernamehistory() {
        return usernamehistory;
    }

    public void setUsernamehistory(String usernamehistory) {
        this.usernamehistory = usernamehistory;
    }

    public String getCaptionhistory() {
        return captionhistory;
    }

    public void setCaptionhistory(String captionhistory) {
        this.captionhistory = captionhistory;
    }

    public Integer getProfilehistory() {
        return profilehistory;
    }

    public void setProfilehistory(Integer profilehistory) {
        this.profilehistory = profilehistory;
    }

    public Integer getPosthistory() {
        return posthistory;
    }

    public void setPosthistory(Integer posthistory) {
        this.posthistory = posthistory;
    }

    public Uri getAddposthistory() {
        return addposthistory;
    }

    public void setAddposthistory(Uri addposthistory) {
        this.addposthistory = addposthistory;
    }







    protected AccountHistory(Parcel in) {
        fullnamehistory = in.readString();
        usernamehistory = in.readString();
        captionhistory = in.readString();
        if (in.readByte() == 0) {
            profilehistory = null;
        } else {
            profilehistory = in.readInt();
        }
        if (in.readByte() == 0) {
            posthistory = null;
        } else {
            posthistory = in.readInt();
        }
        addposthistory = in.readParcelable(Uri.class.getClassLoader());

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fullnamehistory);
        dest.writeString(usernamehistory);
        dest.writeString(captionhistory);
        if (profilehistory == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profilehistory);
        }
        if (posthistory == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(posthistory);
        }
        dest.writeParcelable(addposthistory, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AccountHistory> CREATOR = new Creator<AccountHistory>() {
        @Override
        public AccountHistory createFromParcel(Parcel in) {
            return new AccountHistory(in);
        }

        @Override
        public AccountHistory[] newArray(int size) {
            return new AccountHistory[size];
        }
    };
}
