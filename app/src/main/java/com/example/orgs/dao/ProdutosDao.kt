package com.example.orgs.dao

import com.example.orgs.model.Produto

class ProdutosDao {

    fun adicionar(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto>{
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}