package ru.netologi.domain;

public class NarrowColumnWrap {
    private int id;
    private NarrowColumnWrapSubscribers narrowColumnWrapSubscribers;
    private NarrowColumnWrapСontent narrowColumnWrapСontent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NarrowColumnWrapSubscribers getNarrowColumnWrapSubscribers() {
        return narrowColumnWrapSubscribers;
    }

    public void setNarrowColumnWrapSubscribers(NarrowColumnWrapSubscribers narrowColumnWrapSubscribers) {
        this.narrowColumnWrapSubscribers = narrowColumnWrapSubscribers;
    }

    public NarrowColumnWrapСontent getNarrowColumnWrapСontent() {
        return narrowColumnWrapСontent;
    }

    public void setNarrowColumnWrapСontent(NarrowColumnWrapСontent narrowColumnWrapСontent) {
        this.narrowColumnWrapСontent = narrowColumnWrapСontent;
    }
}
