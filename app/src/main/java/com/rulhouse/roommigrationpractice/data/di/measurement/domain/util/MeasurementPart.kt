package com.oucare.bbt_oucare.feature_node.measurement.domain.util

enum class MeasurementPart {
    Object,
    Ear,
    Oral,        // CBT  ---2 V
    Rectal,        // 肛溫---3
    Liquid,        // 奶瓶溫度計---4
    Pacifier,        // 奶嘴 ---5
    Ambient,        // 室內外溫度計  ---6 V
    Animal,    //  ---7 V
    Forehead,    // 額頭體溫計 ---8
    Basal,        // BBT  ---9 V
    Axillary,   // 腋溫 ---10
    Bath,       // 浴盆  ---11 V
    Diaper,    //
    ASICForehead, //陳博 D83額溫
    HotWater,
    Pill,
    Period,
    Humidity,   // KS-4390
}