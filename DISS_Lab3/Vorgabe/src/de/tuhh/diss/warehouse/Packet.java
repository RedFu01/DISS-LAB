package de.tuhh.diss.warehouse;

import de.tuhh.diss.warehouse.sim.StorageElement;

public class Packet implements StorageElement{
	private int width=0;
	private int height =0;
	private int depth =0;
	
	public boolean fitsInSlot(Slot slot){
		return (this.width <= slot.getWidth() && this.height <= slot.getHeight() && this.depth <= slot.getDepth());
	}
	
	public int getVolume(){
		return this.width * this.height* this.depth;
	}
	
	public int getWidth() {
		return 0; // TODO: Replace this with your own code. 
	}

	public int getHeight() {
		return 0; // TODO: Replace this with your own code. 
	}

	public int getDepth() {
		return 0; // TODO: Replace this with your own code. 
	}

	public int getId() {
		return 0; // TODO: Replace this with your own code. 
	}
	
	public String getDescription() {
		return null; // TODO: Replace this with your own code. 
	}
}
