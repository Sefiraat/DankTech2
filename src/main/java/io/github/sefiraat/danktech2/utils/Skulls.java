package io.github.sefiraat.danktech2.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public enum Skulls {

    PACK_1("407940711108966031f5e86128528d362736cac1514593531008a3c6026192b2"), // WHITE
    PACK_2("dda260fdc05722eebaab390aebc2f9392134440f3b1da5f30e5fe671238a8abb"), // LIGHT GRAY
    PACK_3("982bada50efa8cbd8758c226c7712158c6fca03eaa87e19c5c231d4feda8a2c6"), // PALE GREEN
    PACK_4("5f1d806d1c4cd0b1ddd0bea39f48e8d7475069a6d79d8e06becc12a93a3f3512"), // DEEP GREEN
    PACK_5("561c46bf6e5d5ebc31654dfc4fef2f6bfb4981bef8c1008a7e7ab425b9c49813"), // DULL BLUE
    PACK_6("6fcb6c6d342d96b8fc6e50be2ee8f3bfffb57779e100fc0bf46e0b03b17d0681"), // DEEP BLUE
    PACK_7("39b8bee816fead9ef1ea70ba580327734f94c58b231d57737ca75a9dcdee10d9"), // DULL PINK
    PACK_8("c2a2459c8c2bed9e1d54b9d2d918a4e0d7384b3cd90bd657aa728c80ec4bfed0"), // BRIGHT PINK
    PACK_9("a89b4c5e119a61773dd52d36b572bc0f9548d984ce0841417a301a65351a768d"), // RED

    CELL_1("caf039bec1fc1fb75196092b26e631f37a87dff143fc18297798d47c5eaaf"), // WHITE
    CELL_2("145fd2c3736af4bd2811296661e0cb49bab2cfa65f5c9e598aa43bebfa1ea368"), // LIGHT GRAY
    CELL_3("c607cffcd7864ff27c78b29a2c5955131a677bef6371f88988d3dcc37ef8873"), // PALE GREEN
    CELL_4("85484f4b6367b95bb16288398f1c8dd6c61de988f3a8356d4c3ae73ea38a42"), // DEEP GREEN
    CELL_5("4f26ea93d5fd19a3808a5e5885fc29612657d83dfab9bff527279ccbd6f16"), // DULL BLUE
    CELL_6("d1137b9bf435c4b6b88faeaf2e41d8fd04e1d9663d6f63ed3c68cc16fc724"), // DEEP BLUE
    CELL_7("c54deeeab3b9750c77642ec95e37fe2bdf9adc555e0826dedd769bedd10"), // DULL PINK
    CELL_8("3dd0115e7d84b11b67a4c6176521a0e79d8ba7628587ae38159e828852bfd"), // BRIGHT PINK
    CELL_9("533a5bfc8a2a3a152d646a5bea694a425ab79db694b214f156c37c7183aa"); // RED

    @Getter
    protected static final Skulls[] cachedValues = values();

    @Getter
    private final String hash;

    @ParametersAreNonnullByDefault
    Skulls(String hash) {
        this.hash = hash;
    }

    public ItemStack getPlayerHead() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(hash));
    }

}
