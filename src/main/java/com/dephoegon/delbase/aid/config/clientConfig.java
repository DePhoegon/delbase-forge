package com.dephoegon.delbase.aid.config;
import net.minecraftforge.common.ForgeConfigSpec;

public class clientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Delbase Client Configs");

        // Client(Only) Side Configs
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
