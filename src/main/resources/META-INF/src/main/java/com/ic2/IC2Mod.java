package com.ic2;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod(IC2Mod.MODID)
public class IC2Mod {
    public static final String MODID = "ic2";
    
    public IC2Mod() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.register(this);
    }
}
