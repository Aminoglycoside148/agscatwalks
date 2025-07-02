package net.aminoglycoside.agscatwalks.item;

import net.aminoglycoside.agscatwalks.AGSCatwalksMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AGSCatwalksMod.MODID);



    //add item register stuff like
    //public static final RegistryObject<Item> SAPPHIRE = ITEMS.register(name:"Sapphire",
    //  () -> new Item (new Item.Properties)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
