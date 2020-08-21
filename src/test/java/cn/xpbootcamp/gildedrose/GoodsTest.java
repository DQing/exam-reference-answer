package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {
    @Test
    public void should_decrease_1_of_sellIn_and_quality_when_one_day_passed_given_regular_goods_in_sell_and_quality_is_5() {
        Goods goods = new Goods("Regular", 10, 5);
        goods.updateByDay();

        Assert.assertEquals(9, goods.getSellIn());
        Assert.assertEquals(4, goods.getQuality());
    }
}
