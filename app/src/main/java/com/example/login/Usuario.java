package com.example.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

public class Usuario implements Parcelable {
    private String nombre;
    private int telefono;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, int telefono, String correo, String contraseña) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    protected Usuario(Parcel in) {
        nombre = in.readString();
        telefono = in.readInt();
        correo = in.readString();
        contraseña = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeInt(telefono);
        parcel.writeString(correo);
        parcel.writeString(contraseña);
    }
}
