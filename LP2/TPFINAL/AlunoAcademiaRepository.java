/**
 * @author João Paulo e Matheus Palinkas
 */


import java.sql.*;

public class AlunoAcademiaRepository {
    public boolean postAlunoAcademia(AlunoAcademia aluno){
        try
        {
            String url = "jdbc:microsoft:sqlserver://localhost\\SQLEXPRESS;Database=AulaJava;Trusted_Connection=True";

            String usuario = "java";
            String senha = "sa";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection(url,usuario,senha);
        
            Statement st = con.createStatement();

            String sql = String.format("INSERT INTO Aluno (Nome, Idade, Peso, Altura, Objetivo) Values ('%s', %s, %s, %s, '%s')",
                aluno.getNome(),
                aluno.getIdade(),
                aluno.getPeso(),
                aluno.getAltura(),
                aluno.getObjetivo()
            );

            st.executeUpdate(sql);
            
            con.close();

            return true;
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
