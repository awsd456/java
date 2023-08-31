package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MyConnTest {
    public static void main(String[] args) {

        MyConnection mc = new MyConnection();
        try {
            Connection con = mc.getConn();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//       BoardEntity entity = new BoardEntity();        //insert
//       entity.setTitle("바바바");
//       entity.setCtnt("내용");
//       entity.setIuser(8);
//       BoardDao dao = new BoardDao();
//       int result = dao.insBoard(entity);
//       System.out.println(result);

//       BoardUpdDto dto=new BoardUpdDto();              //update
//       dto.setIboard(2);
//       dto.setIuser(10);
//       dto.setTitle("!!!!제목!!!!");
//       dto.setCtnt("!!!!!내용!!!!");
//       BoardDao dao1=new BoardDao();
//       int result1=dao1.updBoard(dto);
//       System.out.println(result1);

//      BoardDao dao=new BoardDao();
//      BoardSelDto dto=new BoardSelDto();
//      dto.setIboard(4);
//      BoardDetailVo result=dao.selBoardDetail(dto);
//      System.out.println("result = " + result);

        BoardDao dao=new BoardDao();
        BoardSelDto dto=new BoardSelDto();

        dto.setPage(2);
        dto.setRow(30);
        int idx=(dto.getPage()-1)*dto.getRow();
        dto.setStartIdx(idx);

        List<BoardVo> boardVos = dao.selBoard(dto);
        System.out.println(boardVos);

    }
}
