package ru.netologi.domain;

public class PageBody {
    private PageCover pageCover;
    private NarrowColumnWrap narrowColumnWrap;
    private WideColumn wideColumn;

    public PageCover getPageCover() {
        return pageCover;
    }

    public void setPageCover(PageCover pageCover) {
        this.pageCover = pageCover;
    }

    public NarrowColumnWrap getNarrowColumnWrap() {
        return narrowColumnWrap;
    }

    public void setNarrowColumnWrap(NarrowColumnWrap narrowColumnWrap) {
        this.narrowColumnWrap = narrowColumnWrap;
    }

    public WideColumn getWideColumn() {
        return wideColumn;
    }

    public void setWideColumn(WideColumn wideColumn) {
        this.wideColumn = wideColumn;
    }
}
