
package br.edu.ifms.cinema.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Ingresso> ingressos;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private CartaoFidelidade cartaoFidelidade;

    public Cliente() {}

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public List<Ingresso> getIngressos() { return ingressos; }
    public void setIngressos(List<Ingresso> ingressos) { this.ingressos = ingressos; }
    public CartaoFidelidade getCartaoFidelidade() { return cartaoFidelidade; }
    public void setCartaoFidelidade(CartaoFidelidade cartaoFidelidade) { this.cartaoFidelidade = cartaoFidelidade; }
}
