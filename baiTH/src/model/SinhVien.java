package model;
import java.sql.Date;

public class SinhVien
{

    private String masv;
    private String hoten;
    private Date ngaysinh;
    private String nganh;
    private double diemtb;
    private String lop;

    public SinhVien()
    {

    }

    public SinhVien(String masv, String hoten, Date ngaysinh, String nganh, double diemtb, String lop)
    {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.nganh = nganh;
        this.diemtb = diemtb;
        this.lop = lop;
    }

    public String getMasv()
    {
        return masv;
    }

    public void setMasv(String masv)
    {
        this.masv = masv;
    }

    public String getHoten()
    {
        return hoten;
    }

    public void setHoten(String hoten)
    {
        this.hoten = hoten;
    }

    public Date getNgaysinh()
    {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh)
    {
        this.ngaysinh = ngaysinh;
    }

    public String getNganh()
    {
        return nganh;
    }

    public void setNganh(String nganh)
    {
        this.nganh = nganh;
    }

    public double getDiemtb()
    {
        return diemtb;
    }

    public void setDiemtb(double diemtb)
    {
        this.diemtb = diemtb;
    }

    public String getLop()
    {
        return lop;
    }

    public void setLop(String lop)
    {
        this.lop = lop;
    }

}