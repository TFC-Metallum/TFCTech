package tfctech;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static tfctech.TFCTech.MODID;

@SuppressWarnings("unused")
@Config(modid = MODID, category = "")
@Config.LangKey("config." + MODID)
@Mod.EventBusSubscriber(modid = MODID)
public final class TechConfig
{
    @Config.Comment("General configuration")
    @Config.LangKey("config." + MODID + ".devices")
    public static Devices DEVICES = new Devices();

    @SubscribeEvent
    public static void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equals(MODID))
        {
            ConfigManager.sync(MODID, Config.Type.INSTANCE);
        }
    }

    public static class Devices
    {
        @Config.Comment({"Modifier for how quickly electric forge heats items. Smaller number = slower temperature changes. Note: This is affected by TFC global modifier."})
        @Config.RangeDouble(min = 0.01D, max = 1000.0D)
        @Config.LangKey("config." + MODID + ".devices.electricForgeSpeed")
        public double electricForgeSpeed = 1.0D;

        @Config.Comment({"The maximum heat obtainable by electric forge."})
        @Config.RangeDouble(min = 500.0D, max = 5000.0D)
        @Config.LangKey("config." + MODID + ".devices.electricForgeMaxTemperature")
        public double electricForgeMaxTemperature = 1601.0D;

        @Config.Comment({"Electric forge energy consumption modifier."})
        @Config.RangeDouble(min = 0.01D, max = 1000.0D)
        @Config.LangKey("config." + MODID + ".devices.electricForgeEnergyConsumption")
        public double electricForgeEnergyConsumption = 1;

        @Config.RequiresWorldRestart
        @Config.Comment({"Electric forge energy capacity."})
        @Config.RangeInt(min = 1000, max = 1_000_000_000)
        @Config.LangKey("config." + MODID + ".devices.electricForgeEnergyCapacity")
        public int electricForgeEnergyCapacity = 10000;

        @Config.Comment({"Induction crucible energy consumption, in RF/t."})
        @Config.RangeInt(min = 1, max = 1_000_000_000)
        @Config.LangKey("config." + MODID + ".devices.inductionCrucibleEnergyConsumption")
        public int inductionCrucibleEnergyConsumption = 20;

        @Config.RequiresWorldRestart
        @Config.Comment({"Induction crucible energy capacity."})
        @Config.RangeInt(min = 1000, max = 1_000_000_000)
        @Config.LangKey("config." + MODID + ".devices.inductionCrucibleEnergyCapacity")
        public int inductionCrucibleEnergyCapacity = 10000;

        @Config.Comment({"Fridge energy consumption modifier."})
        @Config.RangeDouble(min = 0.01D, max = 1000.0D)
        @Config.LangKey("config." + MODID + ".devices.fridgeEnergyConsumption")
        public double fridgeEnergyConsumption = 1;

        @Config.RequiresWorldRestart
        @Config.Comment({"Fridge energy capacity."})
        @Config.RangeInt(min = 1000, max = 1_000_000_000)
        @Config.LangKey("config." + MODID + ".devices.fridgeEnergyCapacity")
        public int fridgeEnergyCapacity = 10000;

        @Config.Comment({"How fast fridges reach frozen state."})
        @Config.RangeDouble(min = 0.01D, max = 1000.0D)
        @Config.LangKey("config." + MODID + ".devices.fridgeEfficiency")
        public double fridgeEfficiency = 1;

        @Config.Comment({"How fast fridges lose efficiency when the door is open."})
        @Config.RangeDouble(min = 0.01D, max = 1000.0D)
        @Config.LangKey("config." + MODID + ".devices.fridgeLoseEfficiency")
        public double fridgeLoseEfficiency = 1;
    }
}