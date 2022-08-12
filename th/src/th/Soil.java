package th;

public class Soil extends Giaodichnhadat {
	String loaidat;
	double thanhtien =0;
	public String getLoaidat() {
		return loaidat;
	}
	public void setLoaidat(String loaidat) {
		this.loaidat = loaidat;
	}
	
	public double tinhtiendat() {
		if((this.loaidat.trim().charAt(0))=='A') {
			thanhtien =dientich*dongia*1.5;
		}
		else if((this.loaidat.trim().charAt(0))=='B' && (this.loaidat.trim().charAt(0))=='B') {
			thanhtien =dientich*dongia;
	}
		return thanhtien;
	}
	@Override
	public String toString() {
		return super.toString() + this.tinhtiendat() + "\t" + "\n";
	}
	public void checkdat() {
		do {
			if(this.loaidat.trim().charAt(0)!='A' && this.loaidat.trim().charAt(0) =='B'
					&& this.loaidat.trim().charAt(0)=='C')
		System.out.println("nhap lại loại đất");
		
		} while(this.loaidat.trim().charAt(0)!='A' && this.loaidat.trim().charAt(0) !='B'
		&& this.loaidat.trim().charAt(0)!='C');
	}
}
