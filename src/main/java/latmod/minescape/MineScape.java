package latmod.minescape;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MineScape.MOD_ID, name = "MineScape", version = MineScape.VERSION)
public class MineScape
{
	public static final String MOD_ID = "MineScape";
	public static final String VERSION = "@VERSION@";
	
	@Mod.Instance(MineScape.MOD_ID)
	public static MineScape inst;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		System.out.println("Hello!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
	}
}