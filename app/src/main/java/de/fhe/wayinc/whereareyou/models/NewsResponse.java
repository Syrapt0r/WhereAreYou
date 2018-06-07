package de.fhe.wayinc.whereareyou.models;

import java.util.List;

public class NewsResponse {
    private String status;
    private int totalResults;
    private List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public class Article {
        private Source source;
        private String author;
        private String title;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;

        public Source getSource() {
            return source;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getUrl() {
            return url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public class Source {
            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }
    }
}
