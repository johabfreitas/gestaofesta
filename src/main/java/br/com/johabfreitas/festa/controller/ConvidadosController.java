package br.com.johabfreitas.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.johabfreitas.festa.model.Convidado;
import br.com.johabfreitas.festa.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	// Método que receberá a requisição e retornará o nome da view;
	// URL que digitamos no browser para chamar o método "listar()";
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping 
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidados.findAll());
		modelAndView.addObject(new Convidado());
		return modelAndView;	
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
}

/**

Repare que, com @Autowired, podemos injetar o repositório no controller, e isso
nos livra da preocupação de como receber esse objeto na classe.
Veja também a anotação @GetMapping, que anota o nosso método listar(). Ela
diz que nosso método irá responder a requisição HTTP do tipo GET para
/convidados.
Já dentro de listar(), o construtor de ModelAndView recebe o nome da view, e com
o método addObject(), podemos adicionar objetos para a view.

*/