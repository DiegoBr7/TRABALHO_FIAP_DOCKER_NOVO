-- Cria a tabela TB_ACIDENTE com ID auto-incrementado
CREATE TABLE tb_acidente (
    acidente_id INT NOT NULL AUTO_INCREMENT,
    LOCALIZACAO VARCHAR(255) NOT NULL,
    GRAVIDADE VARCHAR(255) NOT NULL,
    DATA DATE NOT NULL,
    PRIMARY KEY (ACIDENTE_ID)
);
