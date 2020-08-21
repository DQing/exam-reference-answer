package cn.xpbootcamp.gildedrose;

public class Goods {
    private String name;
    private int sellIn;
    private int quality;

    public Goods(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateByDay() {
        if (name.equals("Backstage Pass")) {
            quality = quality + 1;
            if (sellIn <= 10) {
                quality = quality + 1;
            }
            decreaseSellIn();
            return;
        }
        decreaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
