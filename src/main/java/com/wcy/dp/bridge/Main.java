package com.wcy.dp.bridge;

/**
 * 将礼物类型用方法实现礼物类，里面存一个礼物实例，将礼物实例作为单独的另一个类再去实例化
 */
public class Main {
    Gift gift = new WarmGift(new Book());
}
