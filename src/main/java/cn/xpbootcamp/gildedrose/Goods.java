package cn.xpbootcamp.gildedrose;

public abstract class Goods {
    protected int sellIn;
    protected int quality;

    protected Goods(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public abstract void updateByDay();

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
