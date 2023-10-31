package com.example.terceraaplicacion;

import android.os.Parcel;
import android.os.Parcelable;

public class Luchador implements Parcelable {

    private int id;
    private String nombre;

    public Luchador() {
    }

    public Luchador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeInt(this.id);
    }

    public void readFromParcel(Parcel source) {
        this.nombre = source.readString();
        this.id = source.readInt();
    }

    protected Luchador(Parcel in) {
        this.nombre = in.readString();
        this.id = in.readInt();
    }

    public static final Parcelable.Creator<Luchador> CREATOR = new Parcelable.Creator<Luchador>() {
        @Override
        public Luchador createFromParcel(Parcel source) {
            return new Luchador(source);
        }

        @Override
        public Luchador[] newArray(int size) {
            return new Luchador[size];
        }
    };
}
