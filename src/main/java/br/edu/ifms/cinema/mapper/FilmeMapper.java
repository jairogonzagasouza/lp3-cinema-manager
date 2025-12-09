
package br.edu.ifms.cinema.mapper;

import br.edu.ifms.cinema.dto.FilmeDTO;
import br.edu.ifms.cinema.model.Filme;

public class FilmeMapper {
    public static FilmeDTO toDTO(Filme f) {
        if (f == null) return null;
        FilmeDTO dto = new FilmeDTO();
        dto.setId(f.getId());
        dto.setTitulo(f.getTitulo());
        dto.setGenero(f.getGenero());
        dto.setDuracaoMinutos(f.getDuracaoMinutos());
        dto.setClassificacao(f.getClassificacao());
        return dto;
    }

    public static Filme toEntity(FilmeDTO dto) {
        if (dto == null) return null;
        Filme f = new Filme();
        f.setId(dto.getId());
        f.setTitulo(dto.getTitulo());
        f.setGenero(dto.getGenero());
        f.setDuracaoMinutos(dto.getDuracaoMinutos());
        f.setClassificacao(dto.getClassificacao());
        return f;
    }
}
