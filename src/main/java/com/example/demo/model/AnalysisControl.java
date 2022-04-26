package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class AnalysisControl implements Serializable {

    private static final long serialVersionUID = 6391225548848481827L;

    private Integer eventId;

    private Integer id;

    private String controlType;
    private String controlContent;


}
