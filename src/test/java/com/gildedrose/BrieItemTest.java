package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrieItemTest {
    @Test
    public void brieItemDegradation_1_Day_Elapsed() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 20) };
        GildedRose app = new GildedRose(items);
        
        for (int i=0; i < 1; i++) {
        	app.updateQuality();
        }
        assertEquals(21, app.items[0].quality);
    }
}
