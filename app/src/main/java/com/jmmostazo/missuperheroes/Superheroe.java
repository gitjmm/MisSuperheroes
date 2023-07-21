package com.jmmostazo.missuperheroes;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Superheroe implements Parcelable{
    private String name;
    private String alter_ego;
    private String historia;
    private float energia;


    public Superheroe(String name, String alter_ego, String historia, float energia) {
        this.name = name;
        this.alter_ego = alter_ego;
        this.historia = historia;
        this.energia = energia;
    }

    protected Superheroe(Parcel in) {
        name = in.readString();
        alter_ego = in.readString();
        historia = in.readString();
        energia = in.readFloat();
    }

    public static final Creator<Superheroe> CREATOR = new Creator<Superheroe>() {
        @Override
        public Superheroe createFromParcel(Parcel in) {
            return new Superheroe(in);
        }

        @Override
        public Superheroe[] newArray(int size) {
            return new Superheroe[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlter_ego() {
        return alter_ego;
    }

    public void setAlter_ego(String alter_ego) {
        this.alter_ego = alter_ego;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(alter_ego);
        parcel.writeString(historia);
        parcel.writeFloat(energia);
    }
}
