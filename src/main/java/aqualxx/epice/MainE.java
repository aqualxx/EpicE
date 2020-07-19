package aqualxx.epice;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainE implements ModInitializer {
    public static final EItem E = new EItem(new Item.Settings().group(ItemGroup.MISC));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("epice", "e"), E);
        System.out.println("why did you install this :concern:");
    } 
}