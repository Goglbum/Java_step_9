package ru.netologi.domain;

public class WideColumn {
    private int id;
    private PageBlockInfo pageBlockInfo;
    private GroupMenu groupMenu;
    private PostInfo postInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PageBlockInfo getPageBlockInfo() {
        return pageBlockInfo;
    }

    public void setPageBlockInfo(PageBlockInfo pageBlockInfo) {
        this.pageBlockInfo = pageBlockInfo;
    }

    public GroupMenu getGroupMenu() {
        return groupMenu;
    }

    public void setGroupMenu(GroupMenu groupMenu) {
        this.groupMenu = groupMenu;
    }

    public PostInfo getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(PostInfo postInfo) {
        this.postInfo = postInfo;
    }
}
