package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurTeamMember;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OurTeamMemberDaoImpl implements OurTeamMemberDao{
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurTeamMember(OurTeamMember ourTeamMember) {
        String query = PropertiesUtil.getProperty("ourTeamMembers.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourTeamMember.getImageName());
            preparedStatement.setString(2, ourTeamMember.getName());
            preparedStatement.setString(3, ourTeamMember.getRole());
            preparedStatement.setString(4, ourTeamMember.getCaption());
            preparedStatement.setString(5, ourTeamMember.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into our_team_members table for the ID : " + ourTeamMember.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into our_team_members table for the ID : " + ourTeamMember.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public OurTeamMember getOurStoryPartById(int id) {
        String query = PropertiesUtil.getProperty("ourTeamMembers.selectById");
        OurTeamMember ourTeamMember = new OurTeamMember();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourTeamMember.setId(resultSet.getInt(1));
                ourTeamMember.setImageBasePath(resultSet.getString(2));
                ourTeamMember.setImageName(resultSet.getString(3));
                ourTeamMember.setName(resultSet.getString(4));
                ourTeamMember.setRole(resultSet.getString(5));
                ourTeamMember.setCaption(resultSet.getString(6));;
                ourTeamMember.setDescription(resultSet.getString(7));
                ourTeamMember.setCreatedAt(resultSet.getTimestamp(8));
                ourTeamMember.setUpdatedAt(resultSet.getTimestamp(9));
                System.out.println("Successfully retrieved data from our_team_members table for ID " + id);
                return ourTeamMember;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from our_team_members table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurStoryPart(OurTeamMember ourTeamMember) {
        String query = PropertiesUtil.getProperty("ourTeamMembers.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourTeamMember.getImageName());
            preparedStatement.setString(2, ourTeamMember.getName());
            preparedStatement.setString(3, ourTeamMember.getRole());
            preparedStatement.setString(4, ourTeamMember.getCaption());
            preparedStatement.setString(5, ourTeamMember.getDescription());
            preparedStatement.setInt(6, ourTeamMember.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in our_team_members table for the ID : " + ourTeamMember.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in our_team_members table for ID " + ourTeamMember.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurStoryPartById(int id) {
        String query = PropertiesUtil.getProperty("ourTeamMembers.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from our_team_members table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from our_team_members table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<OurTeamMember> getAllOurTeamMembers() {
        String query = PropertiesUtil.getProperty("ourTeamMembers.selectAll");
        List<OurTeamMember> ourTeamMembers = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourTeamMembers.add(new OurTeamMember(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getTimestamp(8),
                        resultSet.getTimestamp(9)
                ));
            }
            System.out.println("Successfully fetched all records from our_team_members table.");
            return ourTeamMembers;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from our_team_members table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
