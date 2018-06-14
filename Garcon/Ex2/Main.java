package Apresentacao;

import java.sql.SQLException;

import Negocio.Bebida;
import Negocio.BebidaDAO;

public class Main {

	public static void main(String[] args) throws SQLException {
		BebidaDAO dao = new BebidaDAO();
		
		for (Bebida i : dao.listarTodos()) {
			System.out.println("Id: " + i.getId() + " " + "Nome: " + i.getNome() + " " + i.getPreco());
		}

	}

}
