package de.tuhh.diss.warehouse;
import de.tuhh.diss.io.SimpleIO;

import de.tuhh.diss.warehouse.test.*;
import sun.awt.image.PNGImageDecoder.Chromaticities;
import de.tuhh.diss.warehouse.sim.*;
public class WarehouseApp {
	
	public static void main (String[] args) {
		String choice = "";
		double WIDTH = 0, HEIGHT = 0, DEPTH = 0;
		String DESCRIPTION = "";
		
		// Display of the Header of the Menu 		
		SimpleIO.println("Size: 16x5");
		SimpleIO.println("PhysicalCrane simulator started, v1.0");
		SimpleIO.println("");
		SimpleIO.println("Welcome to TUHH/DISS Warehouse Managment");
		SimpleIO.println("");
		
		

		/*
		 *  As long as the choice is not "0", the 
		 */
		do{ 
			MainMenuText();
			choiceString();
			switch(choice){
				case "1":
					SimpleIO.println("*** Store a packet ***");
					//Packet.width = readDouble();
					DESCRIPTION = setDescription();
					WIDTH = setWidth();
					HEIGHT = setHeight();
					DEPTH = setDepth();
					Packet packet1 = new Packet();/*ID,DESCRIPTION, SLOTNUMBER, WIDTH, HEIGHT, DEPTH*/
				case "2":
					SimpleIO.println("*** Retrieve a packet ***");
					
					SimpleIO.println("Available packets: ");
					SimpleIO.println("*** Enter ID of the packet to be retrieved (0 = abort)");
				default:
					SimpleIO.println("Please make a valid choice! ('1' or '2' or '0'");
					
			}
		}while(choice != "0");
		
		SimpleIO.println("System ends.");
		SimpleIO.println("PhysicalCrane was shut down.");
	}
	
	public static String choiceString
	(){
		String choice = SimpleIO.readString();
		SimpleIO.println("Your choice: "+choice);		
		return(choice);
	}
	public String ReadString(){
		return(SimpleIO.readString());
	}
	public double readDouble(){
		return SimpleIO.readDouble();
	}
	
	public static void MainMenuText(){
		SimpleIO.println("*** Main Menu ***");
		SimpleIO.println("1: Store a packet in the warehouse");
		SimpleIO.println("2: Retrieve a packet from the warehouse");
		SimpleIO.println("0: Quit programm");
		SimpleIO.println("");
	}
	
	/*
	 * Methods for the input of width height and depth for seting up a new packet
	 */
	public static String setDescription(){
		return(SimpleIO.readString());
	}
	public static double setWidth(){
		return(SimpleIO.readDouble());
	}
	public static double setHeight(){
		return(SimpleIO.readDouble());
	}
	public static double setDepth(){
		return(SimpleIO.readDouble());
	}
}
