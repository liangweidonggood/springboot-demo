package com.example.demo.simple.test;

import com.example.demo.model.AnalysisObj2;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        List<AnalysisObj2> list = t.filterList(t.genList());
        List<AnalysisObj2> list1 = new ArrayList<>();
        AnalysisObj2 a1 = null;
        AnalysisObj2 analysisObj2 = list.stream().findFirst().orElse(null);
        int i = 0;
        for (AnalysisObj2 obj : list) {
            i++;
            if (i < 2) {
                continue;
            }
            if (StringUtils.isBlank(obj.getObjNum())) {
                //analysisObj2
            } else {
                //set a1
            }

        }

    }

    private List<AnalysisObj2> filterList(List<AnalysisObj2> list) {
        List<AnalysisObj2> list1 = new ArrayList<>();
        int i = 0;
        for (AnalysisObj2 obj : list) {
            i++;
            if (i < 2) {
                continue;
            }
            list1.add(obj);
        }
        return list1;
    }

    private List<AnalysisObj2> genList() {
        AnalysisObj2 obj1 = new AnalysisObj2().setObjNum("123").setObjName("obj1").setUnitName("unit1").setEventName("event1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj2 = new AnalysisObj2().setObjNum("456").setObjName("obj2").setUnitName("unit2").setEventName("event1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj3 = new AnalysisObj2().setControlType("1").setControlContent("c2");
        AnalysisObj2 obj4 = new AnalysisObj2().setEventName("event1").setControlType("1").setControlContent("c3");
        AnalysisObj2 obj5 = new AnalysisObj2().setControlType("1").setControlContent("c4");
        AnalysisObj2 obj6 = new AnalysisObj2().setUnitName("unit1").setEventName("event1").setControlType("1").setControlContent("c5");
        AnalysisObj2 obj7 = new AnalysisObj2().setControlType("1").setControlContent("c6");
        AnalysisObj2 obj8 = new AnalysisObj2().setEventName("event1").setControlType("1").setControlContent("c7");
        AnalysisObj2 obj9 = new AnalysisObj2().setControlType("1").setControlContent("c8");
        AnalysisObj2 obj10 = new AnalysisObj2().setObjNum("789").setObjName("obj3").setUnitName("unit2").setEventName("event1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj11 = new AnalysisObj2().setControlType("1").setControlContent("c2");
        AnalysisObj2 obj12 = new AnalysisObj2().setEventName("event1").setControlType("1").setControlContent("c3");
        AnalysisObj2 obj13 = new AnalysisObj2().setControlType("1").setControlContent("c4");
        AnalysisObj2 obj14 = new AnalysisObj2().setUnitName("unit2").setEventName("event1").setControlType("1").setControlContent("c5");
        AnalysisObj2 obj15 = new AnalysisObj2().setControlType("1").setControlContent("c6");
        AnalysisObj2 obj16 = new AnalysisObj2().setEventName("event1").setControlType("1").setControlContent("c7");
        AnalysisObj2 obj17 = new AnalysisObj2().setControlType("1").setControlContent("c8");
        List<AnalysisObj2> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);
        list.add(obj7);
        list.add(obj8);
        list.add(obj9);
        list.add(obj10);
        list.add(obj11);
        list.add(obj12);
        list.add(obj13);
        list.add(obj14);
        list.add(obj15);
        list.add(obj16);
        list.add(obj17);
        return list;
    }
}
