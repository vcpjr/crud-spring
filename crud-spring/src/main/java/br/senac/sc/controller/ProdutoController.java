package br.senac.sc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.sc.model.dao.ProdutoDAO;
import br.senac.sc.model.entity.produto.Produto;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

	private ProdutoDAO dao = new ProdutoDAO();

	@GetMapping
	public List<Produto> listarTodosProdutos() {
		return dao.listarTodos();
	}
}