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
    public void should_quality_increase_1_when_one_day_passed_given_backstage_pass_sellIn_more_than_10() {
        BackstagePass backstagePass = new BackstagePass(11, 10);
        backstagePass.updateByDay();

        Assert.assertEquals(10, backstagePass.getSellIn());
        Assert.assertEquals(11, backstagePass.getQuality());
    }

    @Test
    public void should_quality_increase_2_when_one_day_passed_given_backstage_pass_sellIn_more_than_5() {
        BackstagePass backstagePass = new BackstagePass(6, 10);
        backstagePass.updateByDay();

        Assert.assertEquals(5, backstagePass.getSellIn());
        Assert.assertEquals(12, backstagePass.getQuality());
    }

    @Test
    public void should_quality_increase_3_when_one_day_passed_given_backstage_pass_sellIn_less_than_5() {
        BackstagePass backstagePass = new BackstagePass(1, 10);
        backstagePass.updateByDay();

        Assert.assertEquals(0, backstagePass.getSellIn());
        Assert.assertEquals(13, backstagePass.getQuality());
    }

    @Test
    public void should_quality_is_0_when_one_day_passed_given_backstage_pass_sellIn_is_0() {
        BackstagePass backstagePass = new BackstagePass(0, 10);
        backstagePass.updateByDay();

        Assert.assertEquals(-1, backstagePass.getSellIn());
        Assert.assertEquals(0, backstagePass.getQuality());
    }

    @Test
    public void should_quality_is_0_when_one_day_passed_given_backstage_pass_out_sell() {
        BackstagePass backstagePass = new BackstagePass(-1, 0);
        backstagePass.updateByDay();

        Assert.assertEquals(-2, backstagePass.getSellIn());
        Assert.assertEquals(0, backstagePass.getQuality());
    }

    @Test
    public void should_quality_is_50_when_one_day_passed_given_backstage_pass_in_sell_and_quality_is_50() {
        BackstagePass backstagePass = new BackstagePass(11, 50);
        backstagePass.updateByDay();

        Assert.assertEquals(10, backstagePass.getSellIn());
        Assert.assertEquals(50, backstagePass.getQuality());
    }
}
