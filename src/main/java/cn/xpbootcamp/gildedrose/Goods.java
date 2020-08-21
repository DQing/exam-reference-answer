package cn.xpbootcamp.gildedrose;

public class Goods {
    private int sellIn;
    private int quality;

    public Goods(String name, int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateByDay() {
        decreaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            decreaseQuality();
        }
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
