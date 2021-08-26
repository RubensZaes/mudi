package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Bicicleta Aro 29 Caloi Velox Preta");
		pedido.setUrlProduto("https://www.amazon.com.br/Bicicleta-Caloi-Velox-Aro-29-2020/dp/B07YZNZGPH/");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61B3Y56jKAS._AC_SL1024_.jpg");
		pedido.setDescricao("Bicicleta de passeio ideal para quem quer aproveitar o lazer de passeios em parques ou ciclofaixas com os benefícios de uma aro 29");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
