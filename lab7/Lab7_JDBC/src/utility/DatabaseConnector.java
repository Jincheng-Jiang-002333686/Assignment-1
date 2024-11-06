/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;
/**
 *
 * @author jincheng
 */
public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?enableSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "your_password";
    
    //Create
    public static void addPatient(Patient p1) throws SQLException{
        String query = "INSERT INTO patient(firstName, lastName, age, phoneNumber, email, gender, patientType) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getFirstName());
            stmt.setString(2, p1.getLastName());
            stmt.setString(3, p1.getAge());
            stmt.setString(4, p1.getPhoneNumber());
            stmt.setString(5, p1.getEmail());
            stmt.setString(6, p1.getGender());
            stmt.setString(7, p1.getPatientType());
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: " +rows);
            conn.close();
        }catch (SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    //Read
    public static ArrayList<Patient> getPatients(){
        ArrayList <Patient> patients = new ArrayList();
        String query = "SELECT*FROM patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFirstName(rs.getString("firstName"));
                p1.setLastName(rs.getString("lastName"));
                p1.setAge(rs.getString("age"));
                p1.setPhoneNumber(rs.getString("phoneNumber"));
                p1.setEmail(rs.getString("email"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patientType"));
                patients.add(p1);
            }
            rs.close();
            conn.close();
        }catch (SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch (Exception ex){
            System.out.println(ex);
        }
        return patients;
    }
    //Update
    public static void updatePatient(Patient oldPatient, Patient updatedPatient){
        String query = "UPDATE patient SET firstName=?, lastName=?, age=?, phoneNumber=?, email=?, gender=?, patientType=? WHERE id=?";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedPatient.getFirstName());
            stmt.setString(2, updatedPatient.getLastName());
            stmt.setString(3, updatedPatient.getAge());
            stmt.setString(4, updatedPatient.getPhoneNumber());
            stmt.setString(5, updatedPatient.getEmail());
            stmt.setString(6, updatedPatient.getGender());
            stmt.setString(7, updatedPatient.getPatientType());
            stmt.setInt(8, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: " +rows);
            conn.close();
        }catch (SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    //Delete
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM patient WHERE id=?";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: " +rows);
            conn.close();
        }catch (SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
