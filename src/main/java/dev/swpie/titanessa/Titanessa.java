package dev.swpie.titanessa;

import com.mojang.logging.LogUtils;
import dev.swpie.titanessa.block.ModBlocks;
import dev.swpie.titanessa.item.ModCreativeModeTabs;
import dev.swpie.titanessa.item.ModItems;
import dev.swpie.titanessa.worldgen.ModFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Titanessa.MOD_ID)
public class Titanessa {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "titanessa";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Titanessa() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register creative mode tab
        ModCreativeModeTabs.register(modEventBus);

        // Register items to game
        ModItems.register(modEventBus);

        // Register blocks to game
        ModBlocks.register(modEventBus);

        // Register features
        ModFeatures.FEATURES.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
