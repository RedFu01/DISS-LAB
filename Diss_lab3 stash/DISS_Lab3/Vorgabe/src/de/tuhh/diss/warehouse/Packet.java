package de.tuhh.diss.warehouse;

import de.tuhh.diss.warehouse.sim.StorageElement;

public class Packet implements StorageElement{
<<<<<<< HEAD
	private int width, height, depth, slot, id;
	private String description;
=======
	private int width=0;
	private int height =0;
	private int depth =0;
	
	public boolean fitsInSlot(Slot slot){
		return (this.width <= slot.getWidth() && this.height <= slot.getHeight() && this.depth <= slot.getDepth());
	}
	
	public int getVolume(){
		return this.width * this.height* this.depth;
	}
>>>>>>> 52db05f43a3a40ae8f508ea55f000a66de1bb42b
	
	public Packet(int width, int height, int depth, String description){
		this.width = width;
		this.height = height;
		this. depth = depth;
		this.description = description;
		//this. slot = slot;
	}
	
	public Packet(){
		this(0,0,0,"");
	}
	
/*
 * Function for Handover of the width of an element
 * @see de.tuhh.diss.warehouse.sim.StorageElement#getWidth()
 */
	public int getWidth() {
		return width; 
	}
	
/*
 * Function for Handover of the height of an element
 * @see de.tuhh.diss.warehouse.sim.StorageElement#getHeight()
 */
	public int getHeight() {
		return height; 
	}
	
/*
 * Function for handover of the depth of an element
 * @see de.tuhh.diss.warehouse.sim.StorageElement#getDepth()
 */
	public int getDepth() {
		return depth; 
	}

/*
 * Function for handover of the id of an element
 * @see de.tuhh.diss.warehouse.sim.StorageElement#getId()
 */
	
	public int getId() {
		return id; 
	}
	
/*
 * Function for handover of the description of an element
 * @see de.tuhh.diss.warehouse.sim.StorageElement#getDescription()
 */	
	public String getDescription() {
		return description; 
	}
	
	public void setSlot(int newSlot){
		slot = newSlot;
	}
}
