package com.example.bookoreilly.sql;
import java.sql.*;

/*
-- create database day1;
use day1;
create table z1 (
id int  not null primary key auto_increment,
name nvarchar(100)
)

-- insert into z1(name) values('john')
select * from z1;
* */

public class Connection_MySQL {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/day1";
            Connection c = DriverManager.getConnection(url, "root", "12345678");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select name from z1 where id = 1");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            rs.close();
            s.close();
            c.close();
        } catch (Exception e) {

        }

    }
}
