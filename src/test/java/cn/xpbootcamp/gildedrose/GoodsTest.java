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

    @Test
    public void should_quality_keep_0_and_sellIn_decrease_1_when_one_day_passed_given_regular_goods_in_sell_and_quality_is_0() {
        Goods goods = new Goods("Regular", 10, 0);
        goods.updateByDay();

        Assert.assertEquals(9, goods.getSellIn());
        Assert.assertEquals(0, goods.getQuality());
    }

    @Test
    public void should_quality_decrease_2_and_sellIn_decrease_1_when_one_day_passed_given_regular_goods_will_out_sell_and_quality_is_10() {
        Goods goods = new Goods("Regular", 0, 10);
        goods.updateByDay();

        Assert.assertEquals(-1, goods.getSellIn());
        Assert.assertEquals(8, goods.getQuality());
    }

    @Test
    public void should_quality_keep_0_and_sellIn_decrease_1_when_one_day_passed_given_regular_goods_will_out_sell_and_quality_is_0() {
        Goods goods = new Goods("Regular", 0, 0);
        goods.updateByDay();

        Assert.assertEquals(-1, goods.getSellIn());
        Assert.assertEquals(0, goods.getQuality());
    }

    @Test
    public void should_quality_decrease_1_when_one_day_passed_given_backstage_pass_sellIn_more_than_10() {
        Goods goods = new Goods("Backstage Pass", 11, 10);
        goods.updateByDay();

        Assert.assertEquals(10, goods.getSellIn());
        Assert.assertEquals(11, goods.getQuality());
    }
}
