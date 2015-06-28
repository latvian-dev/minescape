package latmod.minescape;

import org.apache.logging.log4j.*;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.resources.I18n;

@Mod(modid = MineScape.MOD_ID, name = "MineScape", version = MineScape.VERSION)
public class MineScape
{
	public static final String MOD_ID = "MineScape";
	public static final String VERSION = "@VERSION@";
	public static final String ASSETS = "minescape:";
	public static final Logger logger = LogManager.getLogger(MOD_ID);
	
	@Mod.Instance(MineScape.MOD_ID)
	public static MineScape inst;
	
	@SidedProxy(clientSide = "latmod.minescape.client.MineScapeClient", serverSide = "latmod.minescape.MineScapeCommon")
	public static MineScapeCommon proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		logger.info("Mod created");
		
		proxy.preInit();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
	}
	
	@SideOnly(Side.CLIENT)
	public static String translate(String s, Object... o)
	{ return I18n.format(ASSETS + s, o); }
}