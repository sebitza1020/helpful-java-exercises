package com.sebitza.javaexercises.interfaces.ex_47;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
