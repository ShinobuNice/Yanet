package ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/estudiantes";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    @WebMethod(operationName = "CrearEstudiante")
    public boolean CrearEstudiante(@WebParam(name = "nombre") String nombre, @WebParam(name = "edad") int edad,
                                  @WebParam(name = "carrera") String carrera, @WebParam(name = "semestre") int semestre,
                                  @WebParam(name = "foto") byte[] foto) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO estudiantes (nombre, edad, carrera, semestre, foto) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.setString(3, carrera);
            stmt.setInt(4, semestre);
            stmt.setBytes(5, foto);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod(operationName = "ObtenerEstudiantes")
    public List<Estudiante> ObtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes")) {
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setCarrera(rs.getString("carrera"));
                estudiante.setSemestre(rs.getInt("semestre"));
                estudiante.setFoto(rs.getBytes("foto"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    @WebMethod(operationName = "ActualizarEstudiante")
    public boolean ActualizarEstudiante(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre,
                                       @WebParam(name = "edad") int edad, @WebParam(name = "carrera") String carrera,
                                       @WebParam(name = "semestre") int semestre, @WebParam(name = "foto") byte[] foto) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE estudiantes SET nombre = ?, edad = ?, carrera = ?, semestre = ?, foto = ? WHERE id = ?")) {
            stmt.setString(1, nombre);
            stmt.setString(3, carrera);
            stmt.setInt(4, semestre);
            stmt.setBytes(5, foto);
            stmt.setInt(6, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @WebMethod(operationName = "EliminarEstudiante")
    public boolean EliminarEstudiante(@WebParam(name = "id") int id) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM estudiantes WHERE id = ?")) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}