package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketItemTest {

    @Test
    public void ticketItemDegradation_1_Day_Elapsed() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        GildedRose app = new GildedRose(items);
        
        for (int i=0; i < 1; i++) {
        	app.updateQuality();
        }
        assertEquals(22, app.items[0].quality);
    }
}
