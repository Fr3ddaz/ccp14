import se.kth.badgers.lexparse.analysis.DepthFirstAdapter;
import se.kth.badgers.lexparse.node.Node;

public class FormattedOutput extends DepthFirstAdapter {

	public int level = -2;
	
	@Override
	public void defaultIn(Node node) {
		// TODO Auto-generated method stub
		level++;
		super.defaultIn(node);
		if (node != null) {
			if(node.parent() != null) {
				String line = node.parent().getClass().toString();
				String line2 = node.getClass().toString();
				String padding = "";
				for (int i = 0; i < level; i++) {
					padding = padding + "\t";
				}
				System.out.println(padding + line.substring(35, line.length()) + " -> " + line2.substring(35, line2.length()));
			}
		}
	}
	
	@Override
	public void defaultOut(Node node) {
		// TODO Auto-generated method stub
		level--;
		super.defaultOut(node);
	}
	
	

}
