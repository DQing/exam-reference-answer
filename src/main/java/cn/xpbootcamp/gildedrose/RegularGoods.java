package cn.xpbootcamp.gildedrose;

public class RegularGoods extends Goods {

    public RegularGoods(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void updateByDay() {
        decreaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
        }
    }

}
