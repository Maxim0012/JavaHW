package org.example.model;

import java.io.Serializable;

public interface LoadFrom {
    Serializable load(String path);
}