package com.green.java.dao;

import com.green.java.dao.model.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    private MyConnection mc;

    public BoardDao() {
        mc = new MyConnection();
    }

    public int insBoard(BoardEntity dto) {
        int result = 0;
        String sql = "insert into t_board \n" +
                "set title=?" +
                ",ctnt=?" +
                ",iuser=?";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getTitle());
            ps.setString(2, dto.getCtnt());
            ps.setInt(3, dto.getIuser());
            result = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    public int updBoard(BoardUpdDto dto) {
        int result = 0;
        String sql = "update t_board \n" +
                "set title=?" +
                ",ctnt=?" +
                ",updated_at=now() \n" +
                "where iboard=? " +
                "and iuser=?";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(3, dto.getIboard());
            ps.setInt(4, dto.getIuser());
            ps.setString(1, dto.getTitle());
            ps.setString(2, dto.getCtnt());
            result = ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    public BoardDetailVo selBoardDetail(BoardSelDto dto) {
        String sql = "select A.iboard,A.title,A.ctnt,B.nm writer,B.main_pic mainPic,A.created_at createdAt " +
                "    from t_board A " +
                "    INNER JOIN t_user B " +
                "    ON A.iuser = B.iuser " +
                "    WHERE A.iboard = ?";

        BoardDetailVo vo = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dto.getIboard());
            rs = ps.executeQuery();
            if (rs.next()) {                  // 다음줄을 가르켰을때 레코드가 있으면 true 아니면 false
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String ctnt = rs.getString("ctnt");
                String writer = rs.getString("writer");
                String mainPic = rs.getString("mainPic");
                String createdAt = rs.getString("createdAt");

                vo = new BoardDetailVo(iboard, title, ctnt, writer, mainPic, createdAt);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return vo;
    }


    public List<BoardVo> selBoard(BoardSelDto dto) {
        List<BoardVo> list = new ArrayList<>();
        String sql = " select A.iboard,A.title,A.created_at createdAt,B.nm writer " +
                " ,B.main_pic mainPic " +
                " from t_board A " +
                " inner join t_user B " +
                "  on A.iuser=B.iuser " +
                " order by iboard desc " +
                " limit ?,? ";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = mc.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1,dto.getStartIdx());
            ps.setInt(2,dto.getRow());
            rs = ps.executeQuery();
            while (rs.next()) {                  // 다음줄을 가르켰을때 레코드가 있으면 true 아니면 false
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String createdAt = rs.getString("createdAt");
                String writer = rs.getString("writer");
                String mainPic = rs.getString("mainPic");

                BoardVo vo=new BoardVo(iboard,title,createdAt,writer,mainPic);
                list.add(vo);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    }

