package edu.pxu.lthdt.bai03;

import java.time.LocalDate;

public class XeOto {
    private String hangXe;
    private int namSanXuat;
    private float dongCo;

    public XeOto() {
    }

    public XeOto(String hangXe, int namSanXuat, float dongCo) {
        this.hangXe = hangXe;
        this.setNamSanXuat(namSanXuat);
        this.dongCo = dongCo;
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

    @Override
    public String toString() {
        LocalDate getDate = LocalDate.now();
        int year = getDate.getYear();
        if (this.namSanXuat > 0 && this.namSanXuat <= year) {
            return "XeOto{" +
                    "hangXe='" + hangXe + '\'' +
                    ", namSanXuat=" + namSanXuat +
                    ", dongCo=" + dongCo +
                    '}';
        }else {
            return "XeOto{" +
                    "hangXe='" + hangXe + '\'' +
                    ", dongCo=" + dongCo +
                    '}';
        }
    }
}
