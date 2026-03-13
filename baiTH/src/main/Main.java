package main;

import java.sql.Date;
import java.util.Scanner;

import model.SinhVien;
import dao.SinhVienDAO;

public class Main
{

    static Scanner sc = new Scanner(System.in);

    public static String chuanHoaTen(String ten)
    {

        ten = ten.trim().toLowerCase();

        String[] words = ten.split("\\s+");

        String result = "";

        for(String w : words)
        {

            result += w.substring(0,1).toUpperCase() + w.substring(1) + " ";

        }

        return result.trim();

    }

    public static void main(String[] args)
    {

        while(true)
        {

        	System.out.println("\n===== QUAN LY SINH VIEN =====");
        	System.out.println("1. Them sinh vien");
        	System.out.println("2. Xoa sinh vien");
        	System.out.println("3. Sua sinh vien");
        	System.out.println("4. In sinh vien theo lop");
        	System.out.println("5. In tat ca");
        	System.out.println("6. In sinh vien theo nganh");
        	System.out.println("7. Sap xep sinh vien theo diem TB");
        	System.out.println("8. Sinh vien sinh theo thang");
        	System.out.println("0. Thoat");
        	System.out.print("\nVui long nhap lua chon cua ban: ");

        	int chon;

        	try
        	{
        	    chon = Integer.parseInt(sc.nextLine());
        	}
        	catch(Exception e)
        	{
        	    System.out.println("Lua chon khong hop le! Vui long nhap so.");
        	    continue;
        	}

        	if(chon < 0 || chon > 8)
        	{
        	    System.out.println("Lua chon phai tu 0 den 8!");
        	    continue;
        	}

            if(chon == 1)
            {

                System.out.print("Ma SV: ");
                String masv = sc.nextLine();

                if(!masv.matches("455105\\d{4}") && !masv.matches("455109\\d{4}"))
                {
                	System.out.println("Ma SV khong hop le!");
                    System.out.println("Ma SV phai co 10 chu so:");
                    System.out.println("455105xxxx (nganh CNTT)");
                    System.out.println("455109xxxx (nganh KTPM)");
                    continue;
                }

                System.out.print("Ho ten: ");
                String hoten = chuanHoaTen(sc.nextLine());

                System.out.print("Ngay sinh yyyy-mm-dd: ");
                String ns = sc.nextLine();

                Date ngaysinh;

                try
                {
                    ngaysinh = Date.valueOf(ns);
                }
                catch(Exception e)
                {
                    System.out.println("Ngay sinh khong hop le");
                    continue;
                }

                int tuoi = 2026 - ngaysinh.toLocalDate().getYear();

                if(tuoi < 15 || tuoi > 110)
                {
                    System.out.println("Tuoi phai >=15, <=110");
                    continue;
                }

                System.out.print("Nganh (CNTT/KTPM): ");
                String nganh = sc.nextLine();

                if(!nganh.equals("CNTT") && !nganh.equals("KTPM"))
                {
                    System.out.println("Nganh khong hop le");
                    continue;
                }
                
                if(masv.startsWith("455105") && !nganh.equals("CNTT"))
                {
                    System.out.println("Ma SV 455105xxxx phai thuoc nganh CNTT");
                    continue;
                }

                if(masv.startsWith("455109") && !nganh.equals("KTPM"))
                {
                    System.out.println("Ma SV 455109xxxx phai thuoc nganh KTPM");
                    continue;
                }
                
                System.out.print("Diem TB: ");
                double diem = Double.parseDouble(sc.nextLine());

                if(diem < 0 || diem > 10)
                {
                    System.out.println("Diem khong hop le");
                    continue;
                }

                System.out.print("Lop: ");
                String lop = sc.nextLine();

                SinhVien sv = new SinhVien(
                        masv,
                        hoten,
                        ngaysinh,
                        nganh,
                        diem,
                        lop
                );

                SinhVienDAO.themSV(sv);

            }

            if(chon == 2)
            {

                System.out.print("Nhap ma SV can xoa: ");
                String masv = sc.nextLine();

                SinhVienDAO.xoaSV(masv);

            }
            if(chon == 3)
            {

            	System.out.print("Nhap ma SV can sua: ");
                String masv = sc.nextLine();

                System.out.print("Ho ten moi: ");
                String hoten = chuanHoaTen(sc.nextLine());

                System.out.print("Ngay sinh yyyy-mm-dd: ");
                Date ngaysinh = Date.valueOf(sc.nextLine());

                System.out.print("Nganh (CNTT/KTPM): ");
                String nganh = sc.nextLine();

                System.out.print("Diem TB: ");
                double diem = Double.parseDouble(sc.nextLine());

                System.out.print("Lop: ");
                String lop = sc.nextLine();

                SinhVien sv = new SinhVien(
                        masv,
                        hoten,
                        ngaysinh,
                        nganh,
                        diem,
                        lop
                );

                SinhVienDAO.suaSV(sv);

            }
            
            if(chon == 4)
            {

                System.out.print("Nhap lop: ");
                String lop = sc.nextLine();

                SinhVienDAO.inTheoLop(lop);

            }
            
            if(chon == 5)
            {

                SinhVienDAO.inTatCa();

            }
            
            if(chon == 6)
            {

                System.out.print("Nhap nganh (CNTT/KTPM): ");
                String nganh = sc.nextLine();

                SinhVienDAO.inTheoNganh(nganh);

            }
            
            if(chon == 7)
            {

                SinhVienDAO.sapXepTheoDiem();

            }
            
            if(chon == 8)
            {

                System.out.print("Nhap thang: ");
                int thang = Integer.parseInt(sc.nextLine());

                SinhVienDAO.sinhTheoThang(thang);

            }
            
            if(chon == 0)
            {
                break;
            }

        }

    }

}