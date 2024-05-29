package bai4.vidu1;

public class GiangVien extends Nguoi {
    private String maGV;
    private String chuyenNganh;
    private String trinhDo;

    public GiangVien(String hoTen, int namSinh, String maGV, String chuyenNganh, String trinhDo) {
        super(hoTen, namSinh);
        this.maGV = maGV;
        this.chuyenNganh = chuyenNganh;
        this.trinhDo = trinhDo;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        if (maGV.equals(" ")){
            System.out.println("Mã giáo viên rỗng!");
        }else {
            this.maGV = maGV;
        }
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "maGV='" + maGV + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                "} " + super.toString();
    }
}