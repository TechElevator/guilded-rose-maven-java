package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class SulfurasItemTest {

	@Test
	public void sulfurasDegradation_1_Day_Elapsed() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 20) };
        GildedRose app = new GildedRose(items);
        
        for (int i=0; i < 9; i++) {
        	app.updateQuality();
        }
        assertEquals(20, app.items[0].quality);
	}

}
