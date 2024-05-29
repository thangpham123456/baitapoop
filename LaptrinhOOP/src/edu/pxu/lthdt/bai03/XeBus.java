package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeBus {
    private String hangXe;
    private int namSanXuat;
    private float dongCo;
    public int soGhe;

    public XeBus() {
    }

    public XeBus(String hangXe, int namSanXuat, float dongCo, int soGhe) {
        this.hangXe = hangXe;
        this.setNamSanXuat(namSanXuat);
        this.dongCo = dongCo;
        this.setSoGhe(soGhe);
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        LocalDate getDate = LocalDate.now();
        int year = getDate.getYear();

        if (namSanXuat > 0 && year <= 2024){
            this.namSanXuat = namSanXuat;
        }else {
            System.out.println("Nam sản xuất sai!");
        }
    }

    public float getDongCo() {
        return dongCo;
    }

    public void setDongCo(float dongCo) {
        this.dongCo = dongCo;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        if (soGhe > 0){
            this.soGhe = soGhe;
        }else {
            System.out.println("Số ghe không hợp lệ!");
        }
    }

    @Override
    public String toString() {
        return "XeBus{" +
                "hangXe='" + hangXe + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", dongCo=" + dongCo +
                ", soGhe=" + soGhe +
                '}';
    }
}
