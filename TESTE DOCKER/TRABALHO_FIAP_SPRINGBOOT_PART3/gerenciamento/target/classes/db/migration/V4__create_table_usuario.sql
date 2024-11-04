-- Cria a tabela TB_USUARIO com ID auto-incrementado
CREATE TABLE tb_usuario (
    usuario_id INT NOT NULL AUTO_INCREMENT,
    EMAIL VARCHAR(100) NOT NULL,
    PASSWORD VARCHAR(100) NOT NULL,
    ROLE VARCHAR(100) DEFAULT 'usuario',
    PRIMARY KEY (usuario_id),
    UNIQUE (EMAIL)
);

