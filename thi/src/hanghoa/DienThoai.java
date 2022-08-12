/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanghoa;

/**
 *
 * @author dell
 */
public class DienThoai extends HangHoa{
    private String nhaSanXuat,dungLuongBoNho,mauSac;

    public DienThoai() {
        
    }
    public DienThoai(String nhaSanXuat, String dungLuongBoNho, String mauSac, String maHang, String ten, Double giaBan) {
        super(maHang, ten, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.mauSac = mauSac;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getDungLuongBoNho() {
        return dungLuongBoNho;
    }

    public void setDungLuongBoNho(String dungLuongBoNho) {
        this.dungLuongBoNho = dungLuongBoNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public void hienThiTT(){
    super.hienThiTT();
        System.out.println("Nha san xuat:"+nhaSanXuat);
        System.out.println("dung luong bo nho:"+dungLuongBoNho);
        System.out.println("mau sac:"+mauSac);
    }
    @Override
    public String toString() {
        return super.toString()+ ",nhaSanXuat=" + nhaSanXuat + ", dungLuongBoNho=" + dungLuongBoNho + ", mauSac=" + mauSac + '}';
    }
    
}
