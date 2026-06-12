package com.motoristas;

public record Motorista(String nome, boolean cnhAtiva, int anosEmpresa) {
    public Motorista {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (anosEmpresa < 0) {
            throw new IllegalArgumentException("Anos de empresa não pode ser negativo");
        }
    }

    public String statusCnh() {
        return cnhAtiva ? "Ativa" : "Inativa";
    }
}
