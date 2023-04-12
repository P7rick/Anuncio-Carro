package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnuncioService {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CarroService carroService;
    @Autowired
    private CambioService cambioService;
    @Autowired
    private OpcionalService opcionaisService;
    @Autowired
    private PlanoPagamentoService planoPagamentoService;

    public Anuncio anuncioVeiculos(Integer idUsuario,String nomeUsuario,String telefoneUsuario, Integer idCarro, Integer idCambio, Integer idPlanoDePagamento, List<Integer> idOpcionalList){

        Anuncio anuncio = new Anuncio();

        anuncio.setUsuario(usuarioService.usuario(idUsuario, nomeUsuario,telefoneUsuario));
        anuncio.setCarro(carroService.carrosAnunciados(idCarro,idCambio,idOpcionalList));
        anuncio.setPlanoPagamento(planoPagamentoService.planoPagamento(idPlanoDePagamento));



        return anuncio;
    }
}
