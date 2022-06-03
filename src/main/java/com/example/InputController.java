package com.example;

import com.example.DTO.Pessoa;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

@Controller
@RequestMapping("/api")
public class InputController {

    @GetMapping("/horario")
    public ResponseEntity horario(){

        return ResponseEntity.ok( LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")));

    }

    @PostMapping("/pessoacontraria")
    public ResponseEntity pessoa(@RequestBody Pessoa pessoa){


        pessoa.setNome(StringUtils.reverse(pessoa.getNome().toLowerCase()));
        pessoa.setProfissao(StringUtils.reverse(pessoa.getProfissao().toLowerCase()));
        pessoa.setSobrenome(StringUtils.reverse(pessoa.getSobrenome().toLowerCase()));

        return ResponseEntity.ok(pessoa);

    }


}
