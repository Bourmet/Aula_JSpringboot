-- Migrations para adicionar coluna de RANK na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);
