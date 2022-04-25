package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class AnalysisObj2 implements Serializable {

    private static final long serialVersionUID = 6391225548848481827L;

    private String objName;
    private String objNum;

    private String unitName;

    private String eventName;

    private String controlType;
    private String controlContent;

}
