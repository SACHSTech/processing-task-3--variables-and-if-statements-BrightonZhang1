import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * This program creates a sketch of a house at random locations with a random colour for the ground
   * @author: B. Zhang
   */

	float randHouseX = random(0,250);
  float randHouseY = random(0,275);
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
  // Colours are assigned to the ground based on the location or quadrant of the top left corner of the house base is in
	// Q2 Blue
	if(randHouseX <= 125 && randHouseY <= (275 / 2)) {
    	background(210, 255, 173);
	}
	//Q1 Orange
	else if(randHouseX >= 125 && randHouseY <= (275 / 2)) {
		background(168, 109, 50);
	}
	//Q3 Green
	else if(randHouseX <= 125 && randHouseY >= (275 / 2)) {
		background(62, 168, 50);
	}
	//Q4 Red
	else if(randHouseX >= 125 && randHouseY >= (275 / 2)) {
		background(168, 50, 50);
	}
  }

  public void draw() {
	// Coordinates used in each function is based on the random variables randHouseX and randHouseY	
	// Sky
		fill(52, 223, 235);
		rect(0, 0, 400, randHouseY + 125);

	// House Body
		fill(240, 65, 65);
		rect(randHouseX, randHouseY, 150, 125);
	
	// Chimney
		fill(91, 98, 110);
		rect(randHouseX + 125, randHouseY - 65, 25, 60);
		
	// Roof Body
		fill(91, 98, 110);
		triangle(randHouseX - 25, randHouseY, randHouseX + 175, randHouseY, randHouseX + 75, randHouseY - 75);
	
  // This code below displays the current time EST in the bottom right corner of the screen
		var hour = hour();
		var minute = minute();
		var second = second();
	
		var currentTime = nf((hour), 2) + ":" + nf(minute, 2) + ":" + nf(second, 2);
	
		fill(255);
		noStroke();
		textSize(19);
	
		text(currentTime, 320, 385);
  }
}