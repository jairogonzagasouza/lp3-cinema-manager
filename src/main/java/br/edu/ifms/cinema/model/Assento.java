
package br.edu.ifms.cinema.model;

import javax.persistence.*;

@Entity
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private boolean disponivel;

    @ManyToOne
    private Sala sala;

    public Assento() {}

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }
}
