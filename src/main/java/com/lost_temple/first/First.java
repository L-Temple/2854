package com.lost_temple.first;

import com.lost_temple.first.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = First.MODID, name = First.NAME, version = First.VERSION, acceptedMinecraftVersions = "1.12.2”)
public class First {
    public static final String MODID = "first”;
    public static final String NAME = "First”;
    public static final String VERSION = "1.0.0”;
    @SidedProxy(clientSide = "com.lost_temple.first.client.ClientProxy”,serverSide = “com.lost_temple.first.common.CommonProxy”)
    public static CommonProxy proxy;
    @Instance(RealMining.MODID)
    public static RealMining instance;
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }
    @EventHandler
    public static void init(FMLInitializationEvent event){
        proxy.init(event);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}