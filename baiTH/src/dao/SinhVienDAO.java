package dao;

import java.sql.*;
import java.util.ArrayList;
import model.SinhVien;
import database.DBConnect;

public class SinhVienDAO {

    public static void themSV(SinhVien sv) {

        try {

            Connection conn = DBConnect.getConnection();

            String sql="INSERT INTO sinhvien VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,sv.getMasv());
            ps.setString(2,sv.getHoten());
            ps.setDate(3,sv.getNgaysinh());
            ps.setString(4,sv.getNganh());
            ps.setDouble(5,sv.getDiemtb());
            ps.setString(6,sv.getLop());

            ps.executeUpdate();

            System.out.println("Them thanh cong");

        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void xoaSV(String masv){

        try{

            Connection conn=DBConnect.getConnection();

            String sql="DELETE FROM sinhvien WHERE masv=?";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,masv);

            ps.executeUpdate();

            System.out.println("Da xoa");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public static void suaSV(SinhVien sv)
    {

        try
        {

            Connection conn = DBConnect.getConnection();

            String sql = "UPDATE sinhvien SET hoten=?, ngaysinh=?, nganh=?, diemtb=?, lop=? WHERE masv=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sv.getHoten());
            ps.setDate(2, sv.getNgaysinh());
            ps.setString(3, sv.getNganh());
            ps.setDouble(4, sv.getDiemtb());
            ps.setString(5, sv.getLop());
            ps.setString(6, sv.getMasv());

            ps.executeUpdate();

            System.out.println("Sua thanh cong");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    
    public static void inTheoLop(String lop)
    {

        try
        {

            Connection conn = DBConnect.getConnection();

            String sql = "SELECT * FROM sinhvien WHERE lop=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, lop);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {

                System.out.println(
                        rs.getString("masv")+" | "+
                        rs.getString("hoten")+" | "+
                        rs.getDate("ngaysinh")+" | "+
                        rs.getString("nganh")+" | "+
                        rs.getDouble("diemtb")+" | "+
                        rs.getString("lop")
                );

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    
    public static void inTatCa(){

        try{

            Connection conn=DBConnect.getConnection();

            String sql="SELECT * FROM sinhvien";

            Statement st=conn.createStatement();

            ResultSet rs=st.executeQuery(sql);

            while(rs.next()){

                System.out.println(
                        rs.getString("masv")+" | "+
                        rs.getString("hoten")+" | "+
                        rs.getDate("ngaysinh")+" | "+
                        rs.getString("nganh")+" | "+
                        rs.getDouble("diemtb")+" | "+
                        rs.getString("lop")
                );

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public static void inTheoNganh(String nganh)
    {

        try
        {

            Connection conn = DBConnect.getConnection();

            String sql = "SELECT * FROM sinhvien WHERE nganh=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nganh);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {

                System.out.println(
                        rs.getString("masv")+" | "+
                        rs.getString("hoten")+" | "+
                        rs.getDate("ngaysinh")+" | "+
                        rs.getString("nganh")+" | "+
                        rs.getDouble("diemtb")+" | "+
                        rs.getString("lop")
                );

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
        public static void sapXepTheoDiem()
        {

            try
            {

                Connection conn = DBConnect.getConnection();

                String sql = "SELECT * FROM sinhvien ORDER BY diemtb DESC";

                Statement st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);

                while(rs.next())
                {

                    System.out.println(
                            rs.getString("masv")+" | "+
                            rs.getString("hoten")+" | "+
                            rs.getDate("ngaysinh")+" | "+
                            rs.getString("nganh")+" | "+
                            rs.getDouble("diemtb")+" | "+
                            rs.getString("lop")
                    );

                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        
        public static void sinhTheoThang(int thang)
        {

            try
            {

                Connection conn = DBConnect.getConnection();

                String sql = "SELECT * FROM sinhvien WHERE MONTH(ngaysinh)=?";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setInt(1, thang);

                ResultSet rs = ps.executeQuery();

                while(rs.next())
                {

                    System.out.println(
                            rs.getString("masv")+" | "+
                            rs.getString("hoten")+" | "+
                            rs.getDate("ngaysinh")+" | "+
                            rs.getString("nganh")+" | "+
                            rs.getDouble("diemtb")+" | "+
                            rs.getString("lop")
                    );

                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }

}