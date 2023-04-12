package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CambioService cambioService;

    @Autowired
    private OpcionalService opcionalService;

    public Carro carrosAnunciados(Integer idCarro, Integer idCambio, List<Integer> opcionalIdList) {

        Carro carro1 = new Carro();

        carro1.setId(1);
        carro1.setNome("Palio");
        carro1.setMarca("Fiat");
        carro1.setAnoModelo(2008);
        carro1.setCor("Prata");
        carro1.setCambio(cambioService.cambio1(idCambio));
        carro1.setOpcionalList(opcionalService.getOpcionais(opcionalIdList));

        Carro carro2 = new Carro();

        carro2.setId(2);
        carro2.setNome("C4");
        carro2.setMarca("Citroen");
        carro2.setAnoModelo(2012);
        carro2.setCor("Azul");
        carro2.setCambio(cambioService.cambio1(idCambio));
        carro2.setOpcionalList(opcionalService.getOpcionais(opcionalIdList));

        Carro carro3 = new Carro();

        carro3.setId(3);
        carro3.setNome("Duster");
        carro3.setMarca("Renault");
        carro3.setAnoModelo(2016);
        carro3.setCor("Prata");
        carro3.setCambio(cambioService.cambio1(idCambio));
        carro3.setOpcionalList(opcionalService.getOpcionais(opcionalIdList));

        Carro carro4 = new Carro();

        carro4.setId(4);
        carro4.setNome("Renegage");
        carro4.setMarca("Jeep");
        carro4.setAnoModelo(2022);
        carro4.setCor("Branco");
        carro4.setCambio(cambioService.cambio1(idCambio));
        carro4.setOpcionalList(opcionalService.getOpcionais(opcionalIdList));

        Carro carro5 = new Carro();

        carro5.setId(5);
        carro5.setNome("Tiggo 8x");
        carro5.setMarca("CAOA");
        carro5.setAnoModelo(2023);
        carro5.setCor("Azul");
        carro5.setCambio(cambioService.cambio1(idCambio));
        carro5.setOpcionalList(opcionalService.getOpcionais(opcionalIdList));

        if (idCarro.equals(1)) {
            return carro1;
        } else if (idCarro.equals(2)) {
            return carro2;
        } else if (idCarro.equals(3)) {
            return carro3;
        } else if (idCarro.equals(4)) {
            return carro4;
        } else if (idCarro.equals(5)) {
            return carro5;
        } else {
            return new Carro();
        }
    }
}


