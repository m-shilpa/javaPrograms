


	enum Apple {
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
		}
		class demo_enum {
		public static void main(String args[])
		{
		Apple ap;
		Apple ap1;
		System.out.println("Here are all Apple constants:");
		// use values()
		Apple allapples[] = Apple.values();
		for(Apple a : allapples)
		System.out.println(a);
		System.out.println();
		// use valueOf()
		int ap2=Apple.Cortland.ordinal();
		ap1 = Apple.valueOf("Cortland");
		System.out.println("ap1 contains " + Apple.Winesap);
		System.out.println("Cortland position " + ap2);
		}
		}
