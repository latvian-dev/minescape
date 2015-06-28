package latmod.minescape.client;

import cpw.mods.fml.relauncher.*;
import latmod.minescape.*;
import latmod.minescape.enums.Skill;

@SideOnly(Side.CLIENT)
public class MineScapeClient extends MineScapeCommon
{
	public void preInit()
	{
		for(Skill s : Skill.VALUES)
			MineScape.logger.info("Skill '" + s.ID + "' name: " + s.getName());
	}
}