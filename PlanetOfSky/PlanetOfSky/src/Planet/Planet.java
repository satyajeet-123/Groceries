package Planet;

import java.util.Arrays;

public class Planet
{
	String name;
	String gas[];
	int moon;
	boolean rings;
	
	Planet(){}

	public Planet(String name, String[] gas, int moon, boolean rings) {
		super();
		this.name = name;
		this.gas = gas;
		this.moon = moon;
		this.rings = rings;
	}

	@Override
	public String toString() {
		return "name : " + name + ", gas : " + Arrays.toString(gas) + ", moon : " + moon + ", rings : " + rings;
	}
	
	
}
