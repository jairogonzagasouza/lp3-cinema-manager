
package br.edu.ifms.cinema;

import br.edu.ifms.cinema.controller.FilmeController;
import br.edu.ifms.cinema.dto.FilmeDTO;
import br.edu.ifms.cinema.dto.ResponseDTO;
import br.edu.ifms.cinema.util.JPAUtil;

public class MainApp {
    public static void main(String[] args) {
        FilmeController fc = new FilmeController();
        FilmeDTO dto = new FilmeDTO();
        dto.setTitulo("Exemplo: A Viagem");
        dto.setGenero("Drama");
        dto.setDuracaoMinutos(120);
        dto.setClassificacao("L");

        ResponseDTO<?> res = fc.create(dto);
        System.out.println("Create result: " + res.getMessage());

        ResponseDTO<?> list = fc.listAll();
        System.out.println("List result: " + list.getMessage());

        // close JPA on exit
        JPAUtil.close();
    }
}
