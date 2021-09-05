package io.github.seggan.liquid;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    private Items() {}

    public static final ItemGroup CATEGORY = new ItemGroup(
        new NamespacedKey(Liquid.getInstance(), "liquids"),
        new CustomItemStack(Material.LAVA_BUCKET, "&6液體")
    );

    public static final SlimefunItemStack MELTER = new SlimefunItemStack(
        "MELTER",
        Material.BLAST_FURNACE,
        "&6熔煉爐",
        "",
        "&7一種高溫爐",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack SOLIDIFIER = new SlimefunItemStack(
        "SOLIDIFIER",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b固化機",
        "",
        "&7先進的冷凍室",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack TESTLCONTAINER = new SlimefunItemStack(
        "TESTLCONTAINER",
        Material.HAY_BLOCK,
        "&b測試 L容器",
        "",
        "&7測試物品"
    );

    public static final SlimefunItemStack TESTLCONTAINER_2 = new SlimefunItemStack(
        "TESTLCONTAINER_2",
        Material.HAY_BLOCK,
        "&b測試 L容器 2",
        "",
        "&7測試物品"
    );

    public static final SlimefunItemStack MIXER = new SlimefunItemStack(
        "MIXER",
        Material.BLAST_FURNACE,
        "&6混合器",
        "",
        "&7這款升級熔煉爐非常完美",
        "&7用於將液體混和在一起",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack CENTRIFUGE = new SlimefunItemStack(
        "CENTRIFUGE",
        Material.HAY_BLOCK,
        "&6離心機",
        "",
        "&7離心機可將液體分離",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack CRYSTALLIZER = new SlimefunItemStack(
        "CRYSTALLIZER",
        Material.DIAMOND_BLOCK,
        "&b結晶器",
        "",
        "&7結晶器可以凝固晶體",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack SPRAY_SOLIDIFIER = new SlimefunItemStack(
        "SPRAY_SOLIDIFIER",
        Material.SMITHING_TABLE,
        "&b噴霧固化機",
        "",
        "&7此將固化機將液體噴出,",
        "&7讓液體變成粉形式.",
        "&7由於工作速度比常規的固化機還快,",
        "&7因此消耗的電力也更多.",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack SLAG = new SlimefunItemStack(
        "SLAG",
        Material.CHARCOAL,
        "&7礦渣",
        "",
        "&7某人無用之物",
        "&7可以是他人的寶藏..."
    );
}
