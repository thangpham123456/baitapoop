package bai4.vidu2;

public class DongVat {
    private String ten;
    private String loai;
    private String gioiTinh;
    private int tuoi;

    public DongVat(String ten, String loai, String gioiTinh, int tuoi) {
        this.setTen(ten);
        this.setLoai(loai);
        this.setGioiTinh(gioiTinh);
        this.setTuoi(tuoi);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0){
            this.tuoi = tuoi;
        } else {
            System.out.println("Tuổi ko hợp lệ!");
        }
    }

    @Override
    public String toString() {
        return "DongVat{" +
                "ten='" + ten + '\'' +
                ", loai='" + loai + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}