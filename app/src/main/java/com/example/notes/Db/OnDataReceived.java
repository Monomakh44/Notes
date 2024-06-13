package com.example.notes.Db;
import com.example.notes.adapter.ListItem;
import java.util.List;

public interface OnDataReceived {
    void onReceived(List<ListItem> list);
}