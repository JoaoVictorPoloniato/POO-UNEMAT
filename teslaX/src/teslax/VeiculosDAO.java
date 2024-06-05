package teslax;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VeiculosDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtesla", "root", "123456");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvar(Veiculos veiculo) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO veiculos (ano_veiculo, combustivel_veiculo, tipocambio_veiculo, cor_veiculo, duracao_garantia, km_veiculo, modelo_veiculo, preco_veiculo, descricao_veiculo, marca_veiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, veiculo.getAno_veiculo());
            st.setString(2, veiculo.getCombustivel_veiculo());
            st.setString(3, veiculo.getTipocambio_veiculo());
            st.setString(4, veiculo.getCor_veiculo());
            st.setString(5, veiculo.getDuracao_garantia());
            st.setString(6, veiculo.getKm_veiculo());
            st.setString(7, veiculo.getModelo_veiculo());
            st.setString(8, veiculo.getPreco_veiculo());
            st.setString(9, veiculo.getDescricao_veiculo());
            st.setString(10, veiculo.getMarca_veiculo());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            return ex.getErrorCode();
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }

    public Veiculos consultar(int id_carro) {

        try {
            Veiculos veiculo = new Veiculos();
            st = conn.prepareStatement("SELECT * FROM veiculos WHERE id_carro = ?");
            st.setInt(1, id_carro);
            rs = st.executeQuery();
            if (rs.next()) {
                veiculo.setAno_veiculo(rs.getString("ano_veiculo"));
                veiculo.setCombustivel_veiculo(rs.getString("combustivel_veiculo"));
                veiculo.setTipocambio_veiculo(rs.getString("tipocambio_veiculo"));
                veiculo.setCor_veiculo(rs.getString("cor_veiculo"));
                veiculo.setDuracao_garantia(rs.getString("duracao_garantia"));
                veiculo.setKm_veiculo(rs.getString("km_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setPreco_veiculo(rs.getString("preco_veiculo"));
                veiculo.setDescricao_veiculo(rs.getString("descricao_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));
                return veiculo;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }

    }

    public boolean excluir(int id_carro) {

        try {
            st = conn.prepareStatement("DELETE FROM veiculos WHERE id_carro = ?");
            st.setInt(1, id_carro);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public String getRelatorio() {
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            st = conn.prepareStatement("SELECT * FROM veiculos");
            rs = st.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setId_carro(rs.getInt("id_carro"));
                veiculo.setAno_veiculo(rs.getString("ano_veiculo"));
                veiculo.setCombustivel_veiculo(rs.getString("combustivel_veiculo"));
                veiculo.setTipocambio_veiculo(rs.getString("tipocambio_veiculo"));
                veiculo.setCor_veiculo(rs.getString("cor_veiculo"));
                veiculo.setDuracao_garantia(rs.getString("duracao_garantia"));
                veiculo.setKm_veiculo(rs.getString("km_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setPreco_veiculo(rs.getString("preco_veiculo"));
                veiculo.setDescricao_veiculo(rs.getString("descricao_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));

                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            return null;
        }
        return String.valueOf(veiculos);
    }

    public String getRelatorioManual() {
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            st = conn.prepareStatement("SELECT * FROM veiculos WHERE tipocambio_veiculo = 'manual'");
            rs = st.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setId_carro(rs.getInt("id_carro"));
                veiculo.setAno_veiculo(rs.getString("ano_veiculo"));
                veiculo.setCombustivel_veiculo(rs.getString("combustivel_veiculo"));
                veiculo.setTipocambio_veiculo(rs.getString("tipocambio_veiculo"));
                veiculo.setCor_veiculo(rs.getString("cor_veiculo"));
                veiculo.setDuracao_garantia(rs.getString("duracao_garantia"));
                veiculo.setKm_veiculo(rs.getString("km_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setPreco_veiculo(rs.getString("preco_veiculo"));
                veiculo.setDescricao_veiculo(rs.getString("descricao_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));

                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            return null;
        }
        return String.valueOf(veiculos);
    }

    public String getRelatorioAutomatico() {
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            st = conn.prepareStatement("SELECT * FROM veiculos WHERE tipocambio_veiculo = 'automatico'");
            rs = st.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setId_carro(rs.getInt("id_carro"));
                veiculo.setAno_veiculo(rs.getString("ano_veiculo"));
                veiculo.setCombustivel_veiculo(rs.getString("combustivel_veiculo"));
                veiculo.setTipocambio_veiculo(rs.getString("tipocambio_veiculo"));
                veiculo.setCor_veiculo(rs.getString("cor_veiculo"));
                veiculo.setDuracao_garantia(rs.getString("duracao_garantia"));
                veiculo.setKm_veiculo(rs.getString("km_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setPreco_veiculo(rs.getString("preco_veiculo"));
                veiculo.setDescricao_veiculo(rs.getString("descricao_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));

                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            return null;
        }
        return String.valueOf(veiculos);
    }

}
