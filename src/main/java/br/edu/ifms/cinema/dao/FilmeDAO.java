
package br.edu.ifms.cinema.dao;

import br.edu.ifms.cinema.model.Filme;

import javax.persistence.EntityManager;
import java.util.List;

public class FilmeDAO extends AbstractDAO<Filme, Long> {
    public FilmeDAO() {
        super();
    }

    // Example of a specific method
    public List<Filme> findByGenero(String genero) {
        EntityManager em = em();
        try {
            return em.createQuery("SELECT f FROM Filme f WHERE f.genero = :g", Filme.class)
                     .setParameter("g", genero)
                     .getResultList();
        } finally {
            em.close();
        }
    }
}
