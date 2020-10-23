package ru.netologi.domain;

public class ArticlesInfo {
    private int id;
    private int quantityArticles;
    private Article article;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityArticles() {
        return quantityArticles;
    }

    public void setQuantityArticles(int quantityArticles) {
        this.quantityArticles = quantityArticles;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
