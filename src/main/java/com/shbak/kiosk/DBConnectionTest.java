package com.shbak.kiosk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionTest {
    public static void main(String[] args) {
        // DB 접속 정보
        String url = "jdbc:postgresql://localhost:5432/kiosk"; // DB명 kiosk
        String user = "postgres";  // 설치 시 입력한 사용자명
        String password = "872034"; // 설치 시 입력한 비밀번호

        // SQL 예제
        String sql = "SELECT id, name FROM category";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                System.out.printf("id=%d, name=%s%n", id, name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
