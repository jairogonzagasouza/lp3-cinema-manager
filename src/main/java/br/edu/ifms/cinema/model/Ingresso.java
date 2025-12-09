
package br.edu.ifms.cinema.model;

import javax.persistence.*;

@Entity
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private Double valor;

    @ManyToOne
    private Sessao sessao;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    private Assento assento;

    public Ingresso() {}

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public Sessao getSessao() { return sessao; }
    public void setSessao(Sessao sessao) { this.sessao = sessao; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Assento getAssento() { return assento; }
    public void setAssento(Assento assento) { this.assento = assento; }
}
