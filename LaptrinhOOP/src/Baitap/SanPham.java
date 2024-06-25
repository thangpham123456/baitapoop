package Baitap;

public class SanPham implements Cloneable {
	private int maSP;
	private String tenSP;
	private int sl;
	private double giaca;
	
	public SanPham(int maSP, String tenSP, int sl, double giaca) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.sl = sl;
		this.giaca = giaca;
	}

	/**
	 * @return the maSP
	 */
	public int getMaSP() {
		return maSP;
	}

	/**
	 * @param maSP the maSP to set
	 */
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	/**
	 * @return the tenSP
	 */
	public String getTenSP() {
		return tenSP;
	}

	/**
	 * @param tenSP the tenSP to set
	 */
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	/**
	 * @return the sl
	 */
	public int getSl() {
		return sl;
	}

	/**
	 * @param sl the sl to set
	 */
	public void setSl(int sl) {
		this.sl = sl;
	}

	/**
	 * @return the giaca
	 */
	public double getGiaca() {
		return giaca;
	}

	/**
	 * @param giaca the giaca to set
	 */
	public void setGiaca(double giaca) {
		this.giaca = giaca;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", sl=" + sl + ", giaca=" + giaca + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
