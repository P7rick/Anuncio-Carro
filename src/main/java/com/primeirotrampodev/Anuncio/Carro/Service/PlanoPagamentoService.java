package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.PlanoPagamento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanoPagamentoService {

    public PlanoPagamento planoPagamento(Integer idPlanoDePagamento) {

        PlanoPagamento planoPagamento1 = new PlanoPagamento();

        planoPagamento1.setId(1);
        planoPagamento1.setNome("Prazo 30 Dias");
        planoPagamento1.setValor(200.00);

        PlanoPagamento planoPagamento2 = new PlanoPagamento();

        planoPagamento2.setId(2);
        planoPagamento2.setNome("Prazo 6 Meses");
        planoPagamento2.setValor(600.00);


        PlanoPagamento planoPagamento3 = new PlanoPagamento();

        planoPagamento3.setId(3);
        planoPagamento3.setNome("Prazo 1 ano");
        planoPagamento3.setValor(1000.00);

        if (idPlanoDePagamento.equals(1)) {
            return planoPagamento1;
        } else if (idPlanoDePagamento.equals(2)) {
            return planoPagamento2;
        } else if (idPlanoDePagamento.equals(3)) {
            return planoPagamento3;
        } else {
            return new PlanoPagamento();
        }

    }


}

