package com.dephoegon.delbase.aid.config;
import net.minecraftforge.common.ForgeConfigSpec;

public class commonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> BURN_CHANCE_NUMBER;
    public static final ForgeConfigSpec.ConfigValue<Integer> BURN_CHANCE_NUMBER_CAP;
    public static final ForgeConfigSpec.ConfigValue<Integer> BLOCK_CUTTING_STATION_CRAFT_TIME;

    static {
        BUILDER.push("Delbase Common Configs");

        BURN_CHANCE_NUMBER = BUILDER.comment("Threshold number for replacing a wood block with an Ash one. Set to -1 for instant replacement of enabled blocks, & a # greater than the Upper Limit to 'effectively disable' it.")
                .defineInRange("Threshold Number", 3, -1, 25);
        BURN_CHANCE_NUMBER_CAP = BUILDER.comment("RNG [0 - #], Used in defining the range. Will replace with an Ash version if Number is higher than the Threshold Number")
                .defineInRange("RNG Upper Limit", 8, 4, 30);
        BLOCK_CUTTING_STATION_CRAFT_TIME = BUILDER.comment("Crafting Time in Ticks(20Tick/Second) for the Block Cutting Station.  Upper limit absurd in cases of self hate.")
                .defineInRange("Cutting Station Crafting Ticks", 52, 5, 1000000);

        // Client&Server Side Configs
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
