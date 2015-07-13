package latmod.minescape.enums;


public enum Rune
{
	AIR("air", 1),
	WATER("water", 4),
	EARTH("earth", 10),
	FIRE("fire", 15),
	MIND("mind", 1),
	BODY("body", 20),
	COSMIC("cosmic", 27),
	CHAOS("chaos", 35),
	ASTRAL("astral", 40),
	NATURE("nature", 44),
	LAW("law", 54),
	DEATH("death", 65),
	ARMADYL("armadyl", 72),
	BLOOD("blood", 77),
	SOUL("soul", 90),
	MIST("mist", 6),
	DUST("dust", 10),
	MUD("mud", 13),
	SMOKE("smoke", 15),
	STEAM("steam", 19),
	LAVA("lava", 23);
	
	public static final Rune[] VALUES = values();
	
	public final String ID;
	
	/** Required level to craft rune */
	public final int runecrafting_level;
	
	Rune(String s, int l)
	{
		ID = s;
		runecrafting_level = l;
	}
}


