package com.example.pesonasulawesi.Account;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class AccountAbout implements Parcelable {

    private String location, top_five, point1, point2, point3, point4, point5, description1, description2, description3, description4, description5;

    private Integer profile_location, picture1, picture2, picture3, picture4, picture5;



    public AccountAbout(String location, String top_five, String point1, String point2, String point3, String point4, String point5, String description1, String description2, String description3, String description4, String description5, Integer profile_location, Integer picture1, Integer picture2, Integer picture3, Integer picture4, Integer picture5) {
        this.location = location;
        this.top_five = top_five;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5 = point5;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.description4 = description4;
        this.description5 = description5;
        this.profile_location = profile_location;
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.picture4 = picture4;
        this.picture5 = picture5;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTop_five() {
        return top_five;
    }

    public void setTop_five(String top_five) {
        this.top_five = top_five;
    }

    public String getPoint1() {
        return point1;
    }

    public void setPoint1(String point1) {
        this.point1 = point1;
    }

    public String getPoint2() {
        return point2;
    }

    public void setPoint2(String point2) {
        this.point2 = point2;
    }

    public String getPoint3() {
        return point3;
    }

    public void setPoint3(String point3) {
        this.point3 = point3;
    }

    public String getPoint4() {
        return point4;
    }

    public void setPoint4(String point4) {
        this.point4 = point4;
    }

    public String getPoint5() {
        return point5;
    }

    public void setPoint5(String point5) {
        this.point5 = point5;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getDescription5() {
        return description5;
    }

    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    public Integer getProfile_location() {
        return profile_location;
    }

    public void setProfile_location(Integer profile_location) {
        this.profile_location = profile_location;
    }

    public Integer getPicture1() {
        return picture1;
    }

    public void setPicture1(Integer picture1) {
        this.picture1 = picture1;
    }

    public Integer getPicture2() {
        return picture2;
    }

    public void setPicture2(Integer picture2) {
        this.picture2 = picture2;
    }

    public Integer getPicture3() {
        return picture3;
    }

    public void setPicture3(Integer picture3) {
        this.picture3 = picture3;
    }

    public Integer getPicture4() {
        return picture4;
    }

    public void setPicture4(Integer picture4) {
        this.picture4 = picture4;
    }

    public Integer getPicture5() {
        return picture5;
    }

    public void setPicture5(Integer picture5) {
        this.picture5 = picture5;
    }


    protected AccountAbout(Parcel in) {
        location = in.readString();
        top_five = in.readString();
        point1 = in.readString();
        point2 = in.readString();
        point3 = in.readString();
        point4 = in.readString();
        point5 = in.readString();
        description1 = in.readString();
        description2 = in.readString();
        description3 = in.readString();
        description4 = in.readString();
        description5 = in.readString();
        if (in.readByte() == 0) {
            profile_location = null;
        } else {
            profile_location = in.readInt();
        }
        if (in.readByte() == 0) {
            picture1 = null;
        } else {
            picture1 = in.readInt();
        }
        if (in.readByte() == 0) {
            picture2 = null;
        } else {
            picture2 = in.readInt();
        }
        if (in.readByte() == 0) {
            picture3 = null;
        } else {
            picture3 = in.readInt();
        }
        if (in.readByte() == 0) {
            picture4 = null;
        } else {
            picture4 = in.readInt();
        }
        if (in.readByte() == 0) {
            picture5 = null;
        } else {
            picture5 = in.readInt();
        }
    }

    public static final Creator<AccountAbout> CREATOR = new Creator<AccountAbout>() {
        @Override
        public AccountAbout createFromParcel(Parcel in) {
            return new AccountAbout(in);
        }

        @Override
        public AccountAbout[] newArray(int size) {
            return new AccountAbout[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(location);
        dest.writeString(top_five);
        dest.writeString(point1);
        dest.writeString(point2);
        dest.writeString(point3);
        dest.writeString(point4);
        dest.writeString(point5);
        dest.writeString(description1);
        dest.writeString(description2);
        dest.writeString(description3);
        dest.writeString(description4);
        dest.writeString(description5);
        if (profile_location == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile_location);
        }
        if (picture1 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(picture1);
        }
        if (picture2 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(picture2);
        }
        if (picture3 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(picture3);
        }
        if (picture4 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(picture4);
        }
        if (picture5 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(picture5);
        }
    }

}
