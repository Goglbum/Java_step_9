package ru.netologi.domain;

public class VkPage {
    private PageHeader pageHeader;
    private SideBar sideBar;
    private PageBody pageBody;

    public PageHeader getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(PageHeader pageHeader) {
        this.pageHeader = pageHeader;
    }

    public SideBar getSideBar() {
        return sideBar;
    }

    public void setSideBar(SideBar sideBar) {
        this.sideBar = sideBar;
    }

    public PageBody getPageBody() {
        return pageBody;
    }

    public void setPageBody(PageBody pageBody) {
        this.pageBody = pageBody;
    }
}
