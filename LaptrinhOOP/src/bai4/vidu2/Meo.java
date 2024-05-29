package bai4.vidu2;

public class Meo extends DongVat{
    private String giongMeo;
    private String loaiLong;

    public Meo(String ten, String loai, String gioiTinh, int tuoi, String giongMeo, String loaiLong) {
        super(ten, loai, gioiTinh, tuoi);
        this.giongMeo = giongMeo;
        this.loaiLong = loaiLong;
    }

    public String getGiongMeo() {
        return giongMeo;
    }

    public void setGiongMeo(String giongMeo) {
        this.giongMeo = giongMeo;
    }

    public String getLoaiLong() {
        return loaiLong;
    }

    public void setLoaiLong(String loaiLong) {
        this.loaiLong = loaiLong;
    }

    @Override
    public String  toString() {
        return "Meo{" +
                "giongMeo='" + giongMeo + '\'' +
                ", loaiLong='" + loaiLong + '\'' +
                "} " + super.toString();
    }
}