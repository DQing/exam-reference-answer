package cn.xpbootcamp.gildedrose;

public class Goods {
    private final String name;
    private int sellIn;
    private int quality;

    public Goods(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateByDay() {
        if (isBackstagePass()) {
            increaseQuality();
            if (sellIn <= 10) {
                increaseQuality();
            }
            if (sellIn <= 5) {
                increaseQuality();
            }
            decreaseSellIn();
            if (isExpired()) {
                quality = 0;
            }
            return;
        }
        if (isRegularGoods()) {
            decreaseQuality();
            decreaseSellIn();
            if (isExpired()) {
                decreaseQuality();
            }
        }

    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private boolean isRegularGoods() {
        return name.equals("Regular");
    }

    private boolean isBackstagePass() {
        return name.equals("Backstage Pass");
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
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
