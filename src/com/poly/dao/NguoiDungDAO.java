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
public class NguoiDungDAO extends DADAO<NguoiDung, String> {

    @Override
    public void insert(NguoiDung entity) {
        String sql = "INSERT INTO Users(username, password, image, address, email)";
        XJdbc.update(sql,
                entity.getTenND(),
                entity.getMatKhau(),
                entity.getHinh(),
                entity.getDiaChi(),
                entity.getEmail());
       
    }

    @Override
    public void update(NguoiDung entity) {
        String sql = "UPDATE Users SET username=?, password=?, image=?, address=?, email=?";
         XJdbc.update(sql,
                entity.getTenND(),
                entity.getMatKhau(),
                entity.getHinh(),
                entity.getDiaChi(),
                entity.getEmail());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM Users WHERE Users=?";
        XJdbc.update(sql, id);
    }

    @Override
    public NguoiDung selectById(String id) {
        String sql = "SELECT * FROM users WHERE username=?";
        List<NguoiDung> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NguoiDung> selectAll() {
        String sql = "SELECT * FROM users";
        return selectBySql(sql);
    }

    @Override
    public List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NguoiDung entity = new NguoiDung();
                    entity.setTenND(rs.getString("username"));
                    entity.setMatKhau(rs.getString("password"));
                    entity.setHinh(rs.getString("image"));
                    entity.setEmail(rs.getString("email"));
                    entity.setDiaChi(rs.getString("address"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
