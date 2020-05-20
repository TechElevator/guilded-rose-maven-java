package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("Wow is a terrible game but this kata is kind of good.");

        /*
         * Special Items:
         * Sulfuras, Hand of Ragnaros
         * Aged Brie
         * Backstage passes to a TAFKAL80ETC concert
         * */
        
        Item[] items = new Item[] {
                new Item("Shovel", 10, 20) //
               };

        GildedRose app = new GildedRose(items);

        int days = 10;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
