package org.example.model;

import java.io.Serializable;

public interface SaveAs {
    void save(String path, Serializable obj);
}