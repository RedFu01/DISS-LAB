package de.tuhh.diss.warehouse;

import de.tuhh.diss.warehouse.sim.StoragePlace;

public class Slot implements StoragePlace {	
	
	private int _number = 0;
	private int _width =0;
	private int _height =0;
	private int _depth = 0;
	private int _positionX =0;
	private int _positionY =0;
	
	public Slot(int number, int width, int height, int depth, int positionX, int positionY){
		this._number = number;
		this._width = width;
		this._height = height;
		this._depth = depth;
		this._positionX = positionX;
		this._positionY = positionY;
	}
	
	public int getNumber() {
		return this._number; 
	}

	public int getWidth() {
		return this._width; 
	}

	public int getHeight() {
		return this._height;
	}
	
	public int getDepth() {
		return this._depth;  
	}

	public int getPositionX() {
		return this._positionX;  
	}
	
	public int getPositionY() {
		return this.positionY;  
	}
}
