package bai4.vidu1;

import java.time.LocalDate;

public class Nguoi {
    private String hoTen;
    private int namSinh;

    public Nguoi(String hoTen, int namSinh) {
        this.setHoTen(hoTen);
        this.setNamSinh(namSinh);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (hoTen.equals(" ")){
            System.out.println("Họ tên sai!");
        }else {
            this.hoTen = hoTen;
        }
    }

    public int getNamSinh() {
        return namSinh;
    }


    public void setNamSinh(int namSinh) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        if (namSinh > 1900 && namSinh < year){
            this.namSinh = namSinh;
        }else {
            System.out.println("Năm sinh sai!");
        }
    }
    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
