package latmod.minescape.enums;

//TODO: Finish
public enum SpellStandard
{
	TELEPORT_HOME("tp_home", 0, 0, Type.TELEPORT),
	STRIKE_AIR("air_strike", 1, 6, Type.COMBAT, Rune.AIR, 1),
	CONFUSE("confuse", 3, 13, Type.COMBAT, Rune.MIND, 1),
	BOLT_ENCHANT_LVL1("enchant_opal_bolts", 4, 9, Type.SKILLING, Rune.COSMIC, 1, Rune.AIR, 2 ),
	STRIKE_WATER("water_strike", 5, 8, Type.COMBAT, Rune.AIR, 1, Rune.WATER, 1),
	JEWELLERY_ENCHANT_LVL1("enchant_sapphire_jewellery", 7, 18, Type.SKILLING, Rune.WATER, 1, Rune.COSMIC, 1),
	BOLT_ENCHANT_LVL2("enchant_sapphire_bolts", 7, 17, Type.SKILLING, Rune.COSMIC, 1, Rune.MIND, 1, Rune.WATER, 1),
	STRIKE_EARTH("earth_strike", 9, 10, Type.COMBAT, Rune.AIR, 1, Rune.EARTH, 1),
	TELEPORT_MOBILISING_ARMIES("tp_mobilising_armies", 10, 19, Type.TELEPORT, Rune.AIR, 1, Rune.WATER, 1, Rune.LAW, 1),
	WEAKEN("weaken", 11, 21, Type.COMBAT, Rune.BODY, 1),
	STRIKE_FIRE("fire_strike", 13, 12, Type.COMBAT, Rune.AIR, 1, Rune.FIRE, 1),
	BOLT_ENCHANT_LVL3("enchant_jade_bolts", 14, 19, Type.SKILLING, Rune.COSMIC, 1, Rune.EARTH, 2),
	BONES_BANANAS("bones_to_bananas", 15, 25, Type.SKILLING, Rune.NATURE, 1, Rune.EARTH, 2, Rune.WATER, 2),
	BOLT_AIR("air_bolt", 17, 14, Type.COMBAT, Rune.AIR, 2, Rune.CHAOS, 1),
	CURSE("curse", 19, 29, Type.COMBAT, Rune.CHAOS, 1),
	BIND("bind", 20, 30, Type.COMBAT, Rune.NATURE, 1),
	ALCHEMY_LOW("low_level_alchemy", 21, 31, Type.SKILLING, Rune.NATURE, 1, Rune.FIRE, 3),
	BOLT_WATER("water_bolt", 23, 18, Type.COMBAT, Rune.WATER, 2, Rune.AIR, 2, Rune.CHAOS, 1),
	BOLT_ENCHANT_LVL4("enchant_pearl_bolts", 24, 29, Type.SKILLING, Rune.COSMIC, 1, Rune.WATER, 2),
	TELEPORT_VARROCK("tp_varrock", 25, 35, Type.TELEPORT, Rune.AIR, 3, Rune.FIRE, 1, Rune.LAW, 1),
	JEWELLERY_ENCHANT_LVL2("enchant_emerald_jewellery", 27, 37, Type.SKILLING, Rune.COSMIC, 1, Rune.AIR, 3),
	BOLT_ENCHANT_LVL5("enchant_emerald_bolts", 27, 37, Type.SKILLING, Rune.COSMIC, 1, Rune.AIR, 3, Rune.NATURE, 1),
	BOLT_EARTH("earth_bolt", 29, 20, Type.COMBAT, Rune.EARTH, 2, Rune.AIR, 2, Rune.CHAOS, 1),
	BOLT_ENCHANT_LVL6("enchant_red_topaz_bolts", 29, 33, Type.SKILLING, Rune.FIRE, 2, Rune.COSMIC, 1),
	TELEPORT_LUMBRIDGE("tp_lumbridge", 31, 41, Type.TELEPORT, Rune.AIR, 3, Rune.EARTH, 1, Rune.LAW, 1),
	GRAB_TELEKINETIC("telekinetic_grab", 33, 43, Type.SKILLING, Rune.AIR, 1, Rune.LAW, 1),
	BOLT_FIRE("fire_bolt", 35, 23, Type.COMBAT, Rune.AIR, 2, Rune.FIRE, 2, Rune.CHAOS, 1),
	TELEPORT_FALADOR("tp_falador", 37, 47, Type.TELEPORT, Rune.AIR, 3, Rune.WATER, 1, Rune.LAW, 1),
	TELEPORT_HOUSE("tp_house", 40, 30, Type.TELEPORT, Rune.AIR, 1, Rune.EARTH, 1, Rune.LAW, 1),
	BLAST_AIR("air_blast", 41, 26, Type.COMBAT, Rune.AIR, 3, Rune.DEATH, 1),
	SUPERHEAT("superheat", 43, 53, Type.SKILLING, Rune.NATURE, 1, Rune.FIRE, 4),
	TELEPORT_CAMELOT("tp_camelot", 45, 56, Type.TELEPORT, Rune.LAW, 1, Rune.AIR, 5),
	BLAST_WATER("water_blast", 47, 29, Type.COMBAT, Rune.AIR, 3, Rune.WATER, 3, Rune.DEATH, 1),
	JEWELLERY_ENCHANT_LVL3("enchant_ruby_jewellery", 49, 59, Type.SKILLING, Rune.COSMIC, 1, Rune.FIRE, 5),
	BOLT_ENCHANT_LVL7("enchant_ruby_bolts", 49, 59, Type.SKILLING, Rune.BLOOD, 1, Rune.FIRE, 5, Rune.COSMIC, 1),
	SNARE("snare", 50, 60, Type.COMBAT, Rune.NATURE, 2),
	DART_SLAYER("slayer_dart", 50, 61, Type.COMBAT, Rune.AIR, 3, Rune.DEATH, 1/*+slayer staff*/),
	TELEPORT_ARDOUGNE("tp_ardougne", 51, 61, Type.TELEPORT, Rune.WATER, 2, Rune.LAW, 2),
	BLAST_EARTH("earth_blast", 53, 32, Type.COMBAT, Rune.AIR, 3, Rune.EARTH, 3, Rune.DEATH, 1),
	HIGH_ALCHEMY("high_level_alchemy", 55, 65, Type.SKILLING, Rune.FIRE, 5, Rune.NATURE ),
	ORB_CHARGE_LVL1("charge_water_orb", 56, 66, Type.SKILLING, Rune.COSMIC, 3, Rune.WATER, 30/*+unpowered orb*/),
	JEWELLERY_ENCHANT_LVL4("enchant_diamond_jewellery", 57, 67, Type.SKILLING, Rune.COSMIC, 1, Rune.EARTH, 10),
	BOLT_ENCHANT_LVL8("enchant_diamond_bolts", 57, 67, Type.SKILLING, Rune.LAW, 2, Rune.COSMIC, 1, Rune.EARTH, 10),
	TELEPORT_WATCHTOWER("tp_watchtower", 58, 68, Type.TELEPORT, Rune.LAW, 2, Rune.EARTH, 2),
	BLAST_FIRE("fire_blast", 59, 35, Type.COMBAT, Rune.AIR, 3, Rune.FIRE, 3, Rune.DEATH),
	STORM_DIVINE("divine_storm", 60, 35, Type.COMBAT, Rune.AIR, 5),
	ORB_CHARGE_LVL2("charge_earth_orb", 60, 70, Type.SKILLING, Rune.COSMIC, 3, Rune.EARTH, 30/*+unpowered orb*/),
	BONES_PEACHES("bones_to_peaches", 60, 65, Type.SKILLING, Rune.NATURE, 2, Rune.WATER, 4, Rune.EARTH, 4),
	TELEPORT_TROLLHEIM("tp_trollheim", 61, 68, Type.TELEPORT, Rune.LAW, 2, Rune.FIRE, 2),
	WAVE_AIR("air_wave", 62, 36, Type.COMBAT, Rune.BLOOD, 1, Rune.AIR, 4),
	ORB_CHARGE_LVL3("charge_fire_orb", 63, 73, Type.SKILLING, Rune.COSMIC, 3, Rune.FIRE, 30/*+unpowered orb*/),
	TELEPORT_APE_ATOLL("tp_ape_atoll", 64, 74, Type.TELEPORT, Rune.LAW, 2, Rune.WATER, 2, Rune.FIRE, 2/*+banana*/),
	WAVE_WATER("water_wave", 65, 38, Type.COMBAT, Rune.BLOOD, 1, Rune.WATER, 4, Rune.AIR, 4),
	ORB_CHARGE_LVL4("charge_air_orb", 66, 76, Type.SKILLING, Rune.COSMIC, 3, Rune.AIR, 30/*+unpowered orb*/),
	VULNERABILITY("vulnerability", 66, 76, Type.COMBAT, Rune.SOUL, 1, Rune.CHAOS, 1),
	JEWELLERY_ENCHANT_LVL5("enchant_dragonstone_jewellery", 68, 78, Type.SKILLING, Rune.COSMIC, 1, Rune.WATER, 15, Rune.EARTH, 15),
	BOLT_ENCHANT_LVL9("enchant_dragonstone_bolts", 68, 78, Type.SKILLING, Rune.SOUL, 1, Rune.COSMIC, 1, Rune.EARTH, 15),
	WAVE_EARTH("earth_wave", 70, 40, Type.COMBAT, Rune.BLOOD, 1, Rune.AIR, 4, Rune.EARTH, 4),
	ENFEEBLE("enfeeble", 73, 83, Type.COMBAT, Rune.SOUL, 1, Rune.BODY, 1),
	TELEOTHER_LUMBRIDGE("teleother_lumbridge", 74, 84, Type.TELEPORT, Rune.SOUL, 1, Rune.LAW, 1, Rune.EARTH, 1),
	WAVE_FIRE("fire_wave", 75, 43, Type.COMBAT, Rune.BLOOD, 1, Rune.AIR, 4, Rune.FIRE, 4),
	STORM_ARMADYL("storm_of_armadyl", 77, 70, Type.COMBAT, Rune.ARMADYL, 1),
	ENTANGLE("entangle", 79, 89, Type.COMBAT, Rune.NATURE, 3),
	STRIKE_POLYPORE("polypore_strike", 80, 80, Type.COMBAT/*+polypore staff*/),
	STAGGER("stagger", 80, 90, Type.COMBAT, Rune.SOUL, 1, Rune.MIND, 1),
	SURGE_AIR("air_surge", 81, 75, Type.COMBAT, Rune.AIR, 5, Rune.DEATH, 1, Rune.BLOOD, 1),
	TELEOTHER_FALADOR("teleother_falador", 82, 92, Type.TELEPORT, Rune.SOUL, 1, Rune.LAW, 1, Rune.WATER, 1),
	BLOCK_TELEPORT("teleport_block", 85, 80, Type.COMBAT, Rune.LAW, 1, Rune.DEATH, 1, Rune.CHAOS, 1),
	SURGE_WATER("water_surge",85, 80, Type.COMBAT, Rune.AIR, 5, Rune.WATER, 5, Rune.DEATH, 1, Rune.BLOOD, 1),
	JEWELLERY_ENCHANT_LVL6("enchant_onyx_jewellery", 87, 97, Type.SKILLING, Rune.FIRE, 20, Rune.EARTH, 20, Rune.COSMIC, 1),
	BOLT_ENCHANT_LVL10("enchant_onyx_bolts", 87, 97, Type.SKILLING, Rune.FIRE, 20, Rune.DEATH, 1, Rune.COSMIC, 1),
	SURGE_EARTH("earth_surge", 90, 85, Type.COMBAT, Rune.AIR, 5, Rune.EARTH, 5, Rune.DEATH, 1, Rune.BLOOD, 1),
	TELEOTHER_CAMELOT("teleother_camelot", 90, 100, Type.TELEPORT, Rune.SOUL, 2, Rune.LAW, 1),
	SURGE_FIRE("fire_surge", 95, 90, Type.COMBAT, Rune.FIRE, 5, Rune.AIR, 5, Rune.DEATH, 1, Rune.BLOOD, 1)
	
	
	
	; public static final SpellStandard[] VALUES = values();
	
	public final String ID;
	
	/** Level required */
	public final int level;
	
	/** XP given per cast */
	public final int xp;
	
	public final Type type;
	
	///** Spell caster (unimplemented) */
		//public final Class<? extends CastSpell> spellClass;
	
	/** Runes required (if any) */
	public final RuneStack[] runes;
	
	SpellStandard(String s, int l, int e, Type t, /*Class<? extends CastSpell> c*/ Object... r)
	{
		ID = s;
		level = l;
		xp = e;
		type = t;
		//spellClass = c;
		runes = RuneStack.compile(r);
	}
	
	public static enum Type
	{
		COMBAT,
		TELEPORT,
		SKILLING;
	}
}