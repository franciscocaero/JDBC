import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dbURL="jdbc:mysql://localhost:3306/estudiantes";
        String dbUsername="root";
        String dbPassword="";
        java.sql.Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            Statement statement;
            statement=connection.createStatement();
            java.sql.ResultSet resultset;
            resultset=statement.executeQuery("select * from calificaciones");
            int id;
            String nombre;
            String cedula;
            float cal1;
            float cal2;
            while (resultset.next()){
                id=resultset.getInt("id");
                nombre=resultset.getString("username");
                cedula=resultset.getString("cedula");
                cal1=resultset.getFloat("calificacion1");
                cal2=resultset.getFloat("calificacion2");
                System.out.println(id+" "+nombre+" "+cedula+" "+cal1+" "+cal2);
            }
        }catch (Exception e){
            System.out.println("Ex");
        }
        //Ingresar datos
        try{
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"408");
            statement.setString(2,"Pablo");
            statement.setString(3,"1245633212");
            statement.setString(4,"13");
            statement.setString(5,"16");
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
        //Ingresar datos por teclado
        try{
            Scanner miVariable=new Scanner(System.in);
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.println("Ingrese el Id del estudiante: ");
            String nuevoId= miVariable.nextLine();
            System.out.println("Ingrese el username del estudiante: ");
            String nuevous= miVariable.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            String nuevoCed= miVariable.nextLine();
            System.out.println("Ingrese la primera calificacion del estudiante: ");
            String nuevaCal= miVariable.nextLine();
            System.out.println("Ingrese la segunda calificacion del estudiante: ");
            String nuevaCal2= miVariable.nextLine();
            statement.setString(1,nuevoId);
            statement.setString(2,nuevous);
            statement.setString(3,nuevoCed);
            statement.setString(4,nuevaCal);
            statement.setString(5,nuevaCal2);
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
    }
}import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dbURL="jdbc:mysql://localhost:3306/estudiantes";
        String dbUsername="root";
        String dbPassword="";
        java.sql.Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            Statement statement;
            statement=connection.createStatement();
            java.sql.ResultSet resultset;
            resultset=statement.executeQuery("select * from calificaciones");
            int id;
            String nombre;
            String cedula;
            float cal1;
            float cal2;
            while (resultset.next()){
                id=resultset.getInt("id");
                nombre=resultset.getString("username");
                cedula=resultset.getString("cedula");
                cal1=resultset.getFloat("calificacion1");
                cal2=resultset.getFloat("calificacion2");
                System.out.println(id+" "+nombre+" "+cedula+" "+cal1+" "+cal2);
            }
        }catch (Exception e){
            System.out.println("Ex");
        }
        //Ingresar datos
        try{
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"408");
            statement.setString(2,"Pablo");
            statement.setString(3,"1245633212");
            statement.setString(4,"13");
            statement.setString(5,"16");
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
        //Ingresar datos por teclado
        try{
            Scanner miVariable=new Scanner(System.in);
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.println("Ingrese el Id del estudiante: ");
            String nuevoId= miVariable.nextLine();
            System.out.println("Ingrese el username del estudiante: ");
            String nuevous= miVariable.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            String nuevoCed= miVariable.nextLine();
            System.out.println("Ingrese la primera calificacion del estudiante: ");
            String nuevaCal= miVariable.nextLine();
            System.out.println("Ingrese la segunda calificacion del estudiante: ");
            String nuevaCal2= miVariable.nextLine();
            statement.setString(1,nuevoId);
            statement.setString(2,nuevous);
            statement.setString(3,nuevoCed);
            statement.setString(4,nuevaCal);
            statement.setString(5,nuevaCal2);
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
    }
}import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dbURL="jdbc:mysql://localhost:3306/estudiantes";
        String dbUsername="root";
        String dbPassword="";
        java.sql.Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            Statement statement;
            statement=connection.createStatement();
            java.sql.ResultSet resultset;
            resultset=statement.executeQuery("select * from calificaciones");
            int id;
            String nombre;
            String cedula;
            float cal1;
            float cal2;
            while (resultset.next()){
                id=resultset.getInt("id");
                nombre=resultset.getString("username");
                cedula=resultset.getString("cedula");
                cal1=resultset.getFloat("calificacion1");
                cal2=resultset.getFloat("calificacion2");
                System.out.println(id+" "+nombre+" "+cedula+" "+cal1+" "+cal2);
            }
        }catch (Exception e){
            System.out.println("Ex");
        }
        //Ingresar datos
        try{
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"408");
            statement.setString(2,"Pablo");
            statement.setString(3,"1245633212");
            statement.setString(4,"13");
            statement.setString(5,"16");
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
        //Ingresar datos por teclado
        try{
            Scanner miVariable=new Scanner(System.in);
            String sql="INSERT INTO calificaciones"+"(id, username, cedula, calificacion1, calificacion2)"+" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            System.out.println("Ingrese el Id del estudiante: ");
            String nuevoId= miVariable.nextLine();
            System.out.println("Ingrese el username del estudiante: ");
            String nuevous= miVariable.nextLine();
            System.out.println("Ingrese la cedula del estudiante: ");
            String nuevoCed= miVariable.nextLine();
            System.out.println("Ingrese la primera calificacion del estudiante: ");
            String nuevaCal= miVariable.nextLine();
            System.out.println("Ingrese la segunda calificacion del estudiante: ");
            String nuevaCal2= miVariable.nextLine();
            statement.setString(1,nuevoId);
            statement.setString(2,nuevous);
            statement.setString(3,nuevoCed);
            statement.setString(4,nuevaCal);
            statement.setString(5,nuevaCal2);
            int rowsInserted= statement.executeUpdate();
            if (rowsInserted>0){
                System.out.println("Datos ingresados correctamente");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
    }
}
