package ru.netology.domain;

public class Post {
    private int id;
    private int postDate;
    private String headerText;
    private String textContent;

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private ViewsInfo viewsInfo;
    private RepostInfo repostInfo;
}
