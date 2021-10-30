package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private ViewsInfo viewsInfo;
    private RepostInfo repostInfo;
    private Copyright copyright;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;
}