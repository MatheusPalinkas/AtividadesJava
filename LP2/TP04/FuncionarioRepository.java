/**
 * @author João Paulo e Matheus Palinkas
 */


import java.sql.*;
import java.util.ArrayList;



public class FuncionarioRepository
{

    public ArrayList<Funcionario> getFuncionarios(String nomePesquisa){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try
        {
            String url = "jdbc:microsoft:sqlserver://localhost\\SQLEXPRESS;Database=AulaJava;Trusted_Connection=True";

            String usuario = "java";
            String senha = "sa";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection(url,usuario,senha);
            

            Statement st = con.createStatement();
            ResultSet rs;
            if(nomePesquisa == ""){
                rs = st.executeQuery("SELECT * FROM tbfuncs AS F INNER JOIN tbcargos AS C ON F.cod_cargo = C.cod_cargo");
            }else{
                rs = st.executeQuery("SELECT * FROM tbfuncs AS F INNER JOIN tbcargos AS C ON F.cod_cargo = C.cod_cargo WHERE F.nome_func LIKE '%" + nomePesquisa + "%'");
            }
            while (rs.next())
            {
                funcionarios.add(montarFuncionario(rs));
            }


            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Erro: " + e.getMessage());
        }

        return funcionarios;
    }

    private Funcionario montarFuncionario(ResultSet rs) throws SQLException
    {
        Funcionario funcionario = new Funcionario(0, null, 0, null);
        Cargo cargo = new Cargo(0, null);
        
        cargo.setCodigo(Integer.parseInt(rs.getString(5)));
        cargo.setCargo(rs.getString(6));

        funcionario.setCodigo(Integer.parseInt(rs.getString(1)));
        funcionario.setNome(rs.getString(2));
        funcionario.setSalario(Double.parseDouble(rs.getString(3)));
        funcionario.setCargo(cargo);

        return funcionario;
    }

}
