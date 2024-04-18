package com.arturlogan.javaaidio.entities.dto.request;

import com.arturlogan.javaaidio.entities.Card;
import com.arturlogan.javaaidio.entities.Conta;
import com.arturlogan.javaaidio.entities.Feature;
import com.arturlogan.javaaidio.entities.News;
import lombok.Data;

import java.util.List;

@Data
public class UsuarioRequest {

    private String nome;
    private Conta conta;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
