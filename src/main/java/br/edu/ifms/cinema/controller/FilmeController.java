
package br.edu.ifms.cinema.controller;

import br.edu.ifms.cinema.dao.FilmeDAO;
import br.edu.ifms.cinema.dto.FilmeDTO;
import br.edu.ifms.cinema.dto.ResponseDTO;
import br.edu.ifms.cinema.mapper.FilmeMapper;
import br.edu.ifms.cinema.model.Filme;

import java.util.List;
import java.util.stream.Collectors;

public class FilmeController {
    private FilmeDAO dao = new FilmeDAO();

    public ResponseDTO<FilmeDTO> create(FilmeDTO dto) {
        try {
            Filme f = FilmeMapper.toEntity(dto);
            dao.add(f);
            return new ResponseDTO<>(true, "Filme criado com sucesso", FilmeMapper.toDTO(f));
        } catch(Exception e) {
            return new ResponseDTO<>(false, "Erro: " + e.getMessage(), null);
        }
    }

    public ResponseDTO<List<FilmeDTO>> listAll() {
        try {
            List<Filme> filmes = dao.getAll();
            List<FilmeDTO> dtos = filmes.stream().map(FilmeMapper::toDTO).collect(Collectors.toList());
            return new ResponseDTO<>(true, "Lista retornada", dtos);
        } catch(Exception e) {
            return new ResponseDTO<>(false, "Erro: " + e.getMessage(), null);
        }
    }
}
