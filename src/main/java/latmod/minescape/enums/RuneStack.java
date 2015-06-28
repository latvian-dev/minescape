package latmod.minescape.enums;

public final class RuneStack
{
	public Rune rune;
	public int size;
	
	public RuneStack(Rune r, int s)
	{
		rune = r;
		size = s;
	}

	public static RuneStack[] compile(Object[] r)
	{
		RuneStack[] stacks = new RuneStack[r.length / 2];
		
		for(int i = 0; i < stacks.length; i++)
			stacks[i] = new RuneStack((Rune)r[i * 2 + 0], (Integer)r[i * 2 + 1]);
		
		return stacks;
	}
}