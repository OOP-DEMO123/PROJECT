/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.dao;

import com.poly.entity.NguoiDung;
import com.poly.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diemp
 */
public class NguoiDungDAO {

    public List<NguoiDung> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert(NguoiDung model) {
        String sql="INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, 
                model.getTenND(), 
                model.getMatKhau(), 
                model.getEmail(), 
                model.getDiaChi(), 
                model.getHinh(),
                model.getVaiTro());
    }

    public void update(NguoiDung model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(String TenND) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public NguoiDung selectById(String TenND) {
                String sql="SELECT * FROM users WHERE username=?";
        List<NguoiDung> list = this.selectBySql(sql, TenND);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    protected List<NguoiDung> selectBySql(String sql, Object...args){
        List<NguoiDung> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NguoiDung entity=new NguoiDung();
                    entity.setTenND(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setEmail(rs.getString("HoTen"));
                    entity.setDiaChi(rs.getString("HoTen"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
