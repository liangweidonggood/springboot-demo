package com.example.demo.simple.test;

import com.example.demo.model.*;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        log.info("begin");
        t.batchInsert(t.groupList(t.filterList(t.genList())));
        log.info("end");
    }

    private List<AnalysisObj2> genList() {
        AnalysisObj2 obj1 = new AnalysisObj2().setObjNum("1").setObjName("o1").setUnitName("u1").setEventName("e1").setControlType("1").setControlContent("c1");

        AnalysisObj2 obj2 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u1").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj3 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u1").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj4 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u1").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj5 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u1").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj6 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u2").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj7 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u2").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj8 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u2").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj9 = new AnalysisObj2().setObjNum("2").setObjName("o2").setUnitName("u2").setEventName("e2").setControlType("1").setControlContent("c1");

        AnalysisObj2 obj10 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u1").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj11 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u1").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj12 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u1").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj13 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u1").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj14 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u2").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj15 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u2").setEventName("e1").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj16 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u2").setEventName("e2").setControlType("1").setControlContent("c1");
        AnalysisObj2 obj17 = new AnalysisObj2().setObjNum("3").setObjName("o2").setUnitName("u2").setEventName("e2").setControlType("1").setControlContent("c1");

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

    //对list对行分组
    private Map<String, Object> groupList(List<AnalysisObj2> list) {
        List<AnalysisObj> objs = new ArrayList<>();
        List<AnalysisUnit> units = new ArrayList<>();
        List<AnalysisEvent> events = new ArrayList<>();
        List<AnalysisControl> controls = new ArrayList<>();
        //先按ObjNum进行分组
        LinkedHashMap<String, List<AnalysisObj2>> objMap = list.stream().collect(Collectors.groupingBy(AnalysisObj2::getObjNum, LinkedHashMap::new, Collectors.toList()));
        AtomicInteger objId = new AtomicInteger(1);
        AtomicInteger unitId = new AtomicInteger(1);
        AtomicInteger eventId = new AtomicInteger(1);
        AtomicInteger controlId = new AtomicInteger(1);
        objMap.forEach((objNum, objList) -> {
            AnalysisObj2 analysisObj2 = objList.get(0);
            //新增分析对象
            AnalysisObj o = new AnalysisObj().setObjName(analysisObj2.getObjName()).setObjNum(objNum);
            o.setId(objId.get());
            objs.add(o);
            //按分析单元分组
            LinkedHashMap<String, List<AnalysisObj2>> unitMap = objList.stream().collect(Collectors.groupingBy(AnalysisObj2::getUnitName, LinkedHashMap::new, Collectors.toList()));
            unitMap.forEach((unitName, unitList) -> {
                AnalysisObj2 analysisObj21 = unitList.get(0);
                //新增分析单元
                AnalysisUnit u = new AnalysisUnit().setUnitName(analysisObj21.getUnitName());
                //分析对象Id也加进去
                u.setObjId(o.getId());
                u.setId(unitId.get());
                units.add(u);
                //按风险事件分组
                LinkedHashMap<String, List<AnalysisObj2>> eventMap = unitList.stream().collect(Collectors.groupingBy(AnalysisObj2::getEventName, LinkedHashMap::new, Collectors.toList()));
                eventMap.forEach((eventName, eventList) -> {
                    AnalysisObj2 analysisObj22 = eventList.get(0);
                    //新增分析事件
                    AnalysisEvent e = new AnalysisEvent().setEventName(analysisObj22.getEventName());
                    //分析单元id也加进去
                    e.setUnitId(u.getId());
                    e.setId(eventId.get());
                    events.add(e);
                    //批量新增管控措施
                    for (AnalysisObj2 analysisObj23 : eventList) {
                        //分析事件id也加进去
                        AnalysisControl c = new AnalysisControl().setControlType(analysisObj23.getControlType()).setControlContent(analysisObj23.getControlContent());
                        c.setEventId(e.getId());
                        c.setId(controlId.get());
                        controls.add(c);
                        controlId.getAndIncrement();
                    }
                    eventId.getAndIncrement();
                });
                unitId.getAndIncrement();
            });
            objId.getAndIncrement();
        });
        Map<String, Object> map = new HashMap<>();
        map.put("objs", objs);
        map.put("units", units);
        map.put("events", events);
        map.put("controls", controls);
        return map;

    }

    //数据批量插入
    private void batchInsert(Map<String, Object> map) {
        List<AnalysisObj> objs = (List<AnalysisObj>) map.get("objs");
        List<AnalysisUnit> units = (List<AnalysisUnit>) map.get("units");
        List<AnalysisEvent> events = (List<AnalysisEvent>) map.get("events");
        List<AnalysisControl> controls = (List<AnalysisControl>) map.get("controls");
        System.out.println(objs);
        System.out.println(units);
        System.out.println(events);
        System.out.println(controls);

    }
}
