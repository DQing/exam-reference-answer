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
            increaseQuality();
            if (sellIn <= 10) {
                increaseQuality();
            }
            if (sellIn <= 5) {
                increaseQuality();
            }
            decreaseSellIn();
            if (sellIn < 0) {
                quality = 0;
            }
            return;
        }
        decreaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void increaseQuality() {
        quality = quality + 1;
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
