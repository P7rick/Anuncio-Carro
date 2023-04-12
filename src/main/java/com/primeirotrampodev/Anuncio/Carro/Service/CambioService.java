package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.Cambio;
import org.springframework.stereotype.Service;

@Service
public class CambioService {

    public Cambio cambio1(Integer idCambio) {

        Cambio cambioAutomatico = new Cambio();
        cambioAutomatico.setId(1);
        cambioAutomatico.setNome("Cambio Automatico");


        Cambio cambioManual = new Cambio();
        cambioManual.setId(2);
        cambioManual.setNome("Cambio Manual");

        if (idCambio.equals(1)) {
            return cambioAutomatico;
        } else if (idCambio.equals(2)) {
            return cambioManual;
        } else {
            return new Cambio();
        }
    }
}
