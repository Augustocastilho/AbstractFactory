package org.main;

public class FabricaBrasil implements FabricaAbstrata{
    @Override
    public Telefone createTelefone() {
        return new TelefoneBrasil();
    }

    @Override
    public Data createData() {
        return new DataBrasil();
    }
}
