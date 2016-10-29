public class StackDemo
	{
		public static void teststack()
		{
			FixedStack stck=new FixedStack();
			assert(stck.push(10)==1);
			assert(stck.push(20)==1);
			assert(stck.push(30)==1);
			assert(stck.push(40)==1);
			assert(stck.push(50)==-1); 
		}
	}
