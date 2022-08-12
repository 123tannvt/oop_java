package th;

public class Home extends Giaodichnhadat {
	String loainha,diachi;
	double thanhtien;
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getLoainha() {
		return loainha;
	}
	public void setLoainha(String loainha) {
		this.loainha = loainha;
	}
	public double tinhtiennha() {
		if(this.loainha=="cao cấp") {
			thanhtien =dientich*dongia;
		}
		else {
			thanhtien =dientich*dongia*0.9;
	}
		return thanhtien;
	}
	@Override
	public String toString() {
		return super.toString() + this.diachi + "\t\t" + this.tinhtiennha() + "\t" + "\n";
	}
	public void checknha() {
		do {
			if(this.loainha!="cao cấp" && this.loainha != "thường")
			System.out.println("mời bạn nhập đúng (cao cấp || thường)");	
		} while(this.loainha!="cao cấp" && this.loainha!="thường");
	}
}
