package latmod.minescape.enums;

import cpw.mods.fml.relauncher.*;
import latmod.minescape.MineScape;

public enum Skill
{
	ATTACK("attack"),
	STRENGTH("strenght"),
	DEFENCE("defence"),
	RANGED("ranged"),
	PRAYER("prayer"),
	MAGIC("magic"),
	CONSTITUTION("constitution"),
	CRAFTING("crafting"),
	MINING("mining"),
	SMITHING("smithing"),
	FISHING("fishing"),
	COOKING("cooking"),
	FIREMAKING("firemaking"),
	WOODCUTTING("woodcutting"),
	RUNECRAFTING("runecrafting"),
	DUNGEONEERING("dungeoneering"),
	AGILITY("agility"),
	HERBLORE("herblore"),
	THIEVING("thieving"),
	FLETCHING("fletching"),
	SLAYER("slayer"),
	FARMING("farming"),
	CONSTRUCTION("construction"),
	HUNTER("hunter"),
	SUMMONING("summoning"),
	DIVINATION("divination"),
	
	; public static final Skill[] VALUES = values();
	
	public final String ID;
	
	Skill(String s)
	{
		ID = s;
	}
	
	@SideOnly(Side.CLIENT)
	public String getName()
	{ return MineScape.translate("skill." + ID); }
	
	// static //
	
	public static int getLevelFromXP(int xp)
	{
		return 0;
	}
	
	public static int getMinXPFromLevel(int level)
	{
		return 0;
	}
}