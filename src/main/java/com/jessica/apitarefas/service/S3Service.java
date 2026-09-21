package com.jessica.apitarefas.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Service
public class S3Service {

    private final S3Client s3Client;

    @Value("${aws.s3.bucket}")
    private String bucketName;

    public S3Service(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    public void enviarArquivo(
            String nomeArquivo,
            byte[] conteudo
    ) {

        PutObjectRequest request = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(nomeArquivo)
                .build();

        s3Client.putObject(
                request,
                RequestBody.fromBytes(conteudo)
        );
    }
}