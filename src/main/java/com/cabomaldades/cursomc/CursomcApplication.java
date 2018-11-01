package com.cabomaldades.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cabomaldades.cursomc.domain.Categoria;
import com.cabomaldades.cursomc.domain.Cidade;
import com.cabomaldades.cursomc.domain.Cliente;
import com.cabomaldades.cursomc.domain.Endereco;
import com.cabomaldades.cursomc.domain.Estado;
import com.cabomaldades.cursomc.domain.ItemPedido;
import com.cabomaldades.cursomc.domain.Pagamento;
import com.cabomaldades.cursomc.domain.PagamentoComBoleto;
import com.cabomaldades.cursomc.domain.PagamentoComCartao;
import com.cabomaldades.cursomc.domain.Pedido;
import com.cabomaldades.cursomc.domain.Produto;
import com.cabomaldades.cursomc.domain.enums.EstadoPagamento;
import com.cabomaldades.cursomc.domain.enums.TipoCliente;
import com.cabomaldades.cursomc.repositories.CategoriaRepository;
import com.cabomaldades.cursomc.repositories.CidadeRepository;
import com.cabomaldades.cursomc.repositories.ClienteRepository;
import com.cabomaldades.cursomc.repositories.EnderecoRepository;
import com.cabomaldades.cursomc.repositories.EstadoRepository;
import com.cabomaldades.cursomc.repositories.ItemPedidoRepository;
import com.cabomaldades.cursomc.repositories.PagamentoRepository;
import com.cabomaldades.cursomc.repositories.PedidoRepository;
import com.cabomaldades.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	}
}
