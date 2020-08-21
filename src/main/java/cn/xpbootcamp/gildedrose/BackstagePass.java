package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Goods {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    public void updateByDay() {
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
    }
}
