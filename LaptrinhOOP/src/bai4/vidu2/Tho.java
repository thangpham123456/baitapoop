package bai4.vidu2;

public class Tho extends DongVat{

    private String giongTho;
    private String loaiLong;

    public Tho(String ten, String loai, String gioiTinh, int tuoi, String giongTho, String loaiLong) {
        super(ten, loai, gioiTinh, tuoi);
        this.giongTho = giongTho;
        this.loaiLong = loaiLong;
    }

    public String getGiongTho() {
        return giongTho;
    }

    public void setGiongTho(String giongTho) {
        this.giongTho = giongTho;
    }

    public String getLoaiLong() {
        return loaiLong;
    }

    public void setLoaiLong(String loaiLong) {
        this.loaiLong = loaiLong;
    }

    @Override
    public String toString() {
        return "Tho{" +
                "giongTho='" + giongTho + '\'' +
                ", loaiLong='" + loaiLong + '\'' +
                "} " + super.toString();
    }
}
