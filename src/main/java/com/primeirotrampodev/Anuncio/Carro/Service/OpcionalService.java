package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.Opcional;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class OpcionalService {

    public List<Opcional> getOpcionais(List<Integer> opcionalIdList) {

        Opcional opcional1 = new Opcional();

        opcional1.setId(1);
        opcional1.setNome("Camera de Ré");

        Opcional opcional2 = new Opcional();

        opcional2.setId(2);
        opcional2.setNome("Multimidia");

        Opcional opcional3 = new Opcional();

        opcional3.setId(3);
        opcional3.setNome("Teto Solar");


        Opcional opcional4 = new Opcional();

        opcional4.setId(4);
        opcional4.setNome("Rodas Esportivas 17");


        Opcional opcional5 = new Opcional();

        opcional5.setId(5);
        opcional5.setNome("Sensor de Ré");


        Opcional opcional6 = new Opcional();

        opcional6.setId(6);
        opcional6.setNome("Trava Eletrica");


        Opcional opcional7 = new Opcional();

        opcional7.setId(7);
        opcional7.setNome("Led nos Farois");


        Opcional opcional8 = new Opcional();

        opcional8.setId(8);
        opcional8.setNome("Vidro eletrico");

        Opcional opcional9 = new Opcional();

        opcional9.setId(9);
        opcional9.setNome("Banco de Couro");


        Opcional opcional10 = new Opcional();

        opcional10.setId(10);
        opcional10.setNome("Computador de Bordo");

        List<Opcional> opcionalList = new ArrayList<>();

        for (Integer cont = 0; cont < opcionalIdList.size(); cont++) {
            Integer idOpcional = opcionalIdList.get(cont);

            if (idOpcional.equals(1)) {
                opcionalList.add(opcional1);
            } else if (idOpcional.equals(2)) {
                opcionalList.add(opcional2);
            } else if (idOpcional.equals(3)) {
                opcionalList.add(opcional3);
            } else if (idOpcional.equals(4)) {
                opcionalList.add(opcional4);
            } else if (idOpcional.equals(5)) {
                opcionalList.add(opcional5);
            } else if (idOpcional.equals(6)) {
                opcionalList.add(opcional6);
            } else if (idOpcional.equals(7)) {
                opcionalList.add(opcional7);
            } else if (idOpcional.equals(8)) {
                opcionalList.add(opcional8);
            } else if (idOpcional.equals(9)) {
                opcionalList.add(opcional9);
            } else if (idOpcional.equals(10)) {
                opcionalList.add(opcional10);
            }
        }
        return opcionalList;
    }
}



