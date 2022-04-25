package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class AnalysisUnit implements Serializable {

    private static final long serialVersionUID = 6391225548848481827L;

    private String unitName;

    private List<AnalysisEvent> eventList;
}
