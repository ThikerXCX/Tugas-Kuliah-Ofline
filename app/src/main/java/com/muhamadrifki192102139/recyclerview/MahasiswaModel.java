package com.muhamadrifki192102139.recyclerview;

public class MahasiswaModel {
    private String NIM,Nama,JenisKelamin,JP;
    public MahasiswaModel(){

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getJP() {
        return JP;
    }

    public void setJP(String JP) {
        this.JP = JP;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public String getNIM(){
        return NIM;
    }

}
