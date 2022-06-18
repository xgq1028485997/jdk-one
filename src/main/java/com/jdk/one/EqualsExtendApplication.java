package com.jdk.one;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class EqualsExtendApplication extends EqualsApplication{

    private String val;

    public EqualsExtendApplication(String name) {
        super(name);
    }
}
