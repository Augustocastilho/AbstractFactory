package org.main;

public class PadroesMundiais {

    private Telefone tel;
    private Data data;

    public PadroesMundiais(FabricaAbstrata fabrica) {
        this.tel = fabrica.createTelefone();
        this.data = fabrica.createData();
    }

    public String imprimirPadraoTelefone() { return this.tel.imprimirPadrao(); }

    public String imprimirPadraoData() { return this.data.imprimirPadrao(); }
}
