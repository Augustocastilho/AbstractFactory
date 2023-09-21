package org.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PadroesMundiaisTest {

    @Test
    void deveImprimirPadraoTelefoneBrasil() {
        FabricaAbstrata fabrica = new FabricaBrasil();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("+55 XX 9XXXX-XXXX", inscricao.imprimirPadraoTelefone());
    }

    @Test
    void deveImprimirPadraoDataBrasil() {
        FabricaAbstrata fabrica = new FabricaBrasil();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("DD/MM/AAAA", inscricao.imprimirPadraoData());
    }

    @Test
    void deveImprimirPadraoTelefoneEUA() {
        FabricaAbstrata fabrica = new FabricaEUA();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("+1 XXX XXX XXXX", inscricao.imprimirPadraoTelefone());
    }

    @Test
    void deveImprimirPadraoDataEUA() {
        FabricaAbstrata fabrica = new FabricaEUA();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("MM/DD/AAAA", inscricao.imprimirPadraoData());
    }

    @Test
    void deveImprimirPadraoTelefoneArgentina() {
        FabricaAbstrata fabrica = new FabricaArgentina();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("+54 9 XXX XXX XXXX", inscricao.imprimirPadraoTelefone());
    }

    @Test
    void deveImprimirPadraoDataArgentina() {
        FabricaAbstrata fabrica = new FabricaArgentina();
        PadroesMundiais inscricao = new PadroesMundiais(fabrica);
        assertEquals("DD/MM/AAAA", inscricao.imprimirPadraoData());
    }
}