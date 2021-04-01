package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String houseName) {
        try (Connection cnx = dataSource.getConnection();
             PreparedStatement pstmt = cnx.prepareStatement("SELECT SUM(points_earned) AS sum_points FROM house_points WHERE house_name = ?;")) {
            pstmt.setString(1, houseName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("sum_points");
                }
            } catch (SQLException se) {
                throw new IllegalStateException("x", se);
            }
            throw new IllegalArgumentException("Cannot find house");
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect database", se);
        }
    }


}
