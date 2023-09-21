package org.main;

public class FabricaArgentina implements FabricaAbstrata{
    @Override
    public Telefone createTelefone() {
        return new TelefoneArgentina();
    }

    @Override
    public Data createData() {
        return new DataArgentina();
    }
}
