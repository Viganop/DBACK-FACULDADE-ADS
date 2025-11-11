-- ===================================================================
-- Script de criação do banco de dados aulajdbc
-- Autor: André Roberto da Silva
-- Descrição: Cria as tabelas 'categorias' e 'produtos' e insere dados
-- ===================================================================

-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS aulajdbc;
USE aulajdbc;

-- ===================================================================
-- Tabela: categorias
-- ===================================================================
CREATE TABLE IF NOT EXISTS categorias (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL
);

-- Inserir registros iniciais em categorias
INSERT INTO categorias (nome) VALUES 
('Eletrônicos'),
('Livros'),
('Alimentos');

-- ===================================================================
-- Tabela: produtos
-- ===================================================================
CREATE TABLE IF NOT EXISTS produtos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    estoque INT NOT NULL,
    id_categoria BIGINT,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

-- Inserir registros iniciais em produtos
INSERT INTO produtos (nome, preco, estoque, id_categoria) VALUES
('Smartphone Samsung Galaxy A15', 1299.90, 25, 1),
('Notebook Dell Inspiron 15', 3899.00, 10, 1),
('Fone de Ouvido Bluetooth JBL', 349.50, 50, 1),
('Monitor LG 24"', 899.00, 15, 1),
('O Senhor dos Anéis', 79.90, 30, 2),
('Clean Code', 149.00, 20, 2),
('A Arte da Guerra', 39.90, 40, 2),
('Dom Casmurro', 29.90, 35, 2),
('Arroz Tipo 1 - 5kg', 23.50, 100, 3),
('Feijão Carioca - 1kg', 8.90, 120, 3),
('Azeite de Oliva Extra Virgem', 34.90, 45, 3),
('Chocolate ao Leite 100g', 6.50, 80, 3);