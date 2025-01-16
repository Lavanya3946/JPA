package com.xworkz.metrostation.runner;

import com.xworkz.metrostation.entity.MetroEntity;
import com.xworkz.metrostation.service.MetroService;
import com.xworkz.metrostation.service.MetroServiceImpl;

public class MetroSaveRunner {
    private static MetroService metroService = new MetroServiceImpl();

    public static void main(String[] args) {
        MetroEntity metroEntity = new MetroEntity(null, "banshakari", "peenya", "banashakari", 50);
        metroService.save(metroEntity);

    }
}
