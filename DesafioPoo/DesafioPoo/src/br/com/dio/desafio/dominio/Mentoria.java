package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate Data;

    public Mentoria() {
    }
    
    public LocalDate getData() {
        return Data;
    }
    public void setData(LocalDate data) {
        Data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [Titulo=" + getTitulo() + ", Descricao=" + getDescricao() + ", Data=" + Data + "]";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    
}
