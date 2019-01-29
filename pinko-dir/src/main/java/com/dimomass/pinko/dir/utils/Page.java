package com.dimomass.pinko.dir.utils;

import com.dimomass.pinko.common.model.ContactEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimomass on 24.10.18.
 */
public class Page {
    int start;
    int end;
    int size;
    int next;
    List<ContactEntry> content = new ArrayList<>();

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ContactEntry> getContent() {
        return content;
    }

    public void setContent(List<ContactEntry> content) {
        this.content = content;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public static Page from(List<ContactEntry> result, int start) {
        Page page = new Page();
        page.start = start;
        page.content = result;
        page.end = result.size();
        page.size = result.size();
        return page;
    }

    public static Page from(List<ContactEntry> result, int start, int size) {
        Page page = Page.from(result,start);
        page.setSize(result.size());
        return page;
    }
}
