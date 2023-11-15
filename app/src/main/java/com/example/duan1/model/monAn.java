package com.example.duan1.model;

public class monAn {

    private int maMonAn;
    private String tenMonAn;
    private int giaMonAn;
    private int soLuongMonAn;

    private String moTaMonAn;

    private int hinhAnhMonAn;


    public monAn(int maMonAn, String tenMonAn, int giaMonAn, int soLuongMonAn, String moTaMonAn, int hinhAnhMonAn) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.giaMonAn = giaMonAn;
        this.soLuongMonAn = soLuongMonAn;
        this.moTaMonAn = moTaMonAn;
        this.hinhAnhMonAn = hinhAnhMonAn;
    }

    public monAn(String tenMonAn, int giaMonAn) {
        this.tenMonAn = tenMonAn;
        this.giaMonAn = giaMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getMoTaMonAn() {
        return moTaMonAn;
    }

    public void setMoTaMonAn(String moTaMonAn) {
        this.moTaMonAn = moTaMonAn;
    }

    public int getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(int giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public int getSoLuongMonAn() {
        return soLuongMonAn;
    }

    public void setSoLuongMonAn(int soLuongMonAn) {
        this.soLuongMonAn = soLuongMonAn;
    }

    public int getHinhAnhMonAn() {
        return hinhAnhMonAn;
    }

    public void setHinhAnhMonAn(int hinhAnhMonAn) {
        this.hinhAnhMonAn = hinhAnhMonAn;
    }
}
