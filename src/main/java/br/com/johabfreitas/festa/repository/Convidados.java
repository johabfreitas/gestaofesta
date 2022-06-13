package br.com.johabfreitas.festa.repository;

/**
 * Só de implementar a interface JpaRepository ,já poderemos injetar um objeto do
   tipo Convidados no nosso controller, por exemplo.
   E, para o leitor mais atento, essas duas classes, Convidado e Convidados, fazem
   parte do Model no padrão MVC.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.johabfreitas.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
