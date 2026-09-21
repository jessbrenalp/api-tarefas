package com.jessica.apitarefas.controller;

import com.jessica.apitarefas.service.S3Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/arquivos")
public class ArquivoController {

    private final S3Service s3Service;

    public ArquivoController(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @PostMapping
    public ResponseEntity<String> enviarArquivo(
            @RequestParam("arquivo") MultipartFile arquivo
    ) throws IOException {

        s3Service.enviarArquivo(
                arquivo.getOriginalFilename(),
                arquivo.getBytes()
        );

        return ResponseEntity.ok(
                "Arquivo enviado com sucesso!"
        );
    }
}