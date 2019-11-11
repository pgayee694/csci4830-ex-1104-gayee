package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   void extractedMethod(List<? extends Super> list, String p) {
	   for (Super item: list) {
		   if (item.contains(p)) {
			   System.out.println(item);
		   }
	   }
   }
}

class Super {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Super{
   String name;

   @Override
   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Super{
   String name;

   @Override
   public boolean contains(String p) {
       return name.contains(p);
   }
}