package br.com.yanbarreiro.forum.controller;

import br.com.yanbarreiro.forum.controller.dto.TopicoDto;
import br.com.yanbarreiro.forum.model.Curso;
import br.com.yanbarreiro.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<TopicoDto> list(){
        Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }

}
