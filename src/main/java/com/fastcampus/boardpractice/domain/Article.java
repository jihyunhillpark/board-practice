package com.fastcampus.boardpractice.domain;


import java.time.LocalDateTime;
import lombok.Setter;

@Setter
public class Article {

    private Long id;

    @Setter
    private String title;
    @Setter
    private String content;
    @Setter
    private Integer viewCount;
    @Setter
    private Integer likeCount;
    @Setter
    private String hashtag;

    private LocalDateTime createdAt;
    @Setter
    private String createdBy;
    private LocalDateTime modifiedAt;
    @Setter
    private String modifiedBy;

    public Article(String title, String content, Integer viewCount, Integer likeCount,
        String hashtag, String createBy) {
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.hashtag = hashtag;
        this.createdBy = createBy;
        this.modifiedBy = createBy;
    }
    void test() {
        Article article = new Article(
            "title",
            "content",
            0,
            0,
            "#java",
            "jihyun"
        );
    }
}
