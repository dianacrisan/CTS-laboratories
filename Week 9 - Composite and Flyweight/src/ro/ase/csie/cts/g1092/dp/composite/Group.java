package ro.ase.csie.cts.g1092.dp.composite;

import java.util.ArrayList;

public class Group extends AbstractNode {

	String groupName;
	ArrayList<AbstractNode> nodes = new ArrayList<>();
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	@Override
	public void attack(String playerName) {
		for(AbstractNode node : nodes) {
			node.attack(playerName);
		}
	}

	@Override
	public void retreat() {
		for(AbstractNode node : nodes) {
			node.retreat();
		}
	}

	@Override
	public void move() {
		// our decision to move characters individually
		throw new UnsupportedOperationException();
	}

	// advantage to not implementing them in the abstract class: we do not forget about them
	@Override
	public void addNode(AbstractNode node) {
		this.nodes.add(node);
	}

	@Override
	public void removeNode(AbstractNode node) {
		this.nodes.remove(node);
	}

	@Override
	public AbstractNode getNode(int key) {
		// key should be validated
		return this.nodes.get(key);
	}
	
}
