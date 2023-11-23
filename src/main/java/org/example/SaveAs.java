package org.example;

import java.io.Serializable;

public interface SaveAs {
    void save(String path, Serializable obj);
}