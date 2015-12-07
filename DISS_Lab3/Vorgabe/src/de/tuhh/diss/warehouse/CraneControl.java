package de.tuhh.diss.warehouse;

import de.tuhh.diss.warehouse.sim.StorageElement;
import de.tuhh.diss.warehouse.sim.PhysicalCrane;

public class CraneControl {

	private PhysicalCrane crane; // Define an instance variable for CraneControl class

	public CraneControl(PhysicalCrane cr) {
		
		crane = cr;
	}

	private void driveTo(int x, int y) {
		driveToX(x);
		driveToY(y);
	}

	private void driveToX(int x) {
		int currentX = crane.getPositionX();
		int targetX = x;
		
		if (currentX < targetX) {
			while (currentX < targetX) {
				crane.forward();
				stallTestX();
			}
		}
		
		if (currentX > targetX) {
			while (currentX > targetX) {
				crane.backward();
				stallTestX();
			}
		}
		
		else {
			crane.stopX();
		}
	}

	private void driveToY(int y) {
		int currentY = crane.getPositionY();
		int targetY = y;
		
		if (currentY < targetY) {
			while (currentY < targetY) {
				crane.up();
				stallTestY();
			}
		}
		
		if (currentY > targetY) {
			while (currentY > targetY) {
				crane.down();
				stallTestY();
			}
		}
		
		else {
			crane.stopY();
		}
	}

	private void driveToLoadingPosition() {
		int LoadPosX = crane.getLoadingPosX();
		int LoadPosY = crane.getLoadingPosY();
		
		driveTo(LoadPosX,LoadPosY);
	}

	private void stallTestX() {		
		// Exception
	}

	private void stallTestY() {
		// Exception
	}

	public void storePacket(int x, int y, StorageElement packet) {
		
		driveToLoadingPosition();
		
		
		crane.storeElement();
	}

	public StorageElement retrievePacket(int x, int y) {
		
		
		
		crane.retrieveElement();
		return null;
	}

	public void shutdown() {
		crane.shutdown();
	}
}
