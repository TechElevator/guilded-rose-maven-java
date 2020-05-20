package com.gildedrose;

import static org.junit.Assert.*;
import org.junit.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;

public class NormalItemTest {

    @Test
    public void normalItemDegradation_1_Day_Elapsed() {
        Item[] items = new Item[] { new Item("foo", 10, 20) };
        GildedRose app = new GildedRose(items);
        
        for (int i=0; i < 1; i++) {
        	app.updateQuality();
        }
        assertEquals(19, app.items[0].quality);
    }
    
}
