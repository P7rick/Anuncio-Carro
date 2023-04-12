package com.primeirotrampodev.Anuncio.Carro.Controller;

import com.primeirotrampodev.Anuncio.Carro.Entidade.Anuncio;
import com.primeirotrampodev.Anuncio.Carro.Service.AnuncioService;
import com.primeirotrampodev.Anuncio.Carro.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {


    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("anuncio-carro")
    public Anuncio atributosAnuncio(@RequestParam("idDoUsuario") Integer idDoUsuario,
                                    @RequestParam("nomeUsuario") String nomeUsuario,
                                    @RequestParam("telefoneUsuario") String telefoneUsuario,
                                    @RequestParam("carroId") Integer carroId,
                                    @RequestParam("cambioId") Integer cambioId,
                                    @RequestParam("planoDePagamentoId") Integer planoDePagamentoId,
                                    @RequestParam("listaOpcionalId") List <Integer> opcionalIdList) {

        return anuncioService.anuncioVeiculos(idDoUsuario, nomeUsuario, telefoneUsuario, carroId, cambioId, planoDePagamentoId, opcionalIdList);

    }
}
