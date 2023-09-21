package org.main;

public class FabricaEUA implements FabricaAbstrata{
    @Override
    public Telefone createTelefone() {
        return new TelefoneEUA();
    }

    @Override
    public Data createData() {
        return new DataEUA();
    }
}
