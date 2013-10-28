package com.baihena.combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CombinationHelper {

	private List<Punches> punches = new ArrayList<Punches>();
	private List<Blocks> blocks = new ArrayList<Blocks>();
	private List<Kicks> kicks = new ArrayList<Kicks>();
	private List<Movement> moves = new ArrayList<Movement>();
	private Random rand = new Random();
	private Punches[] punchesAsArray = Punches.values();
	private Kicks[] kicksAsArray = Kicks.values();
	private Movement[] movesAsArray = Movement.values();
	private Blocks[] blocksAsArray = Blocks.values();
		
	public void buildCombination() {
		for (int i = 0; i < rand.nextInt(2); i++) {
			pickPunch();
		}
		for (int i = 0; i < rand.nextInt(2); i++) {
			pickBlock();
		}
		for (int i = 0; i < rand.nextInt(2); i++) {
			int kickOrMove = rand.nextInt(1) + 1;
			if(kickOrMove < 2) {
				pickMovement(); 
			} else {
				pickKick();
			}
		}
	}
	
	private void pickPunch() {
		punches.add(punchesAsArray[rand.nextInt(punchesAsArray.length)]);
	}
	
	private void pickKick() {
		kicks.add(kicksAsArray[rand.nextInt(kicksAsArray.length)]);
	}
	
	private void pickMovement() {
		moves.add(movesAsArray[rand.nextInt(movesAsArray.length)]);
	}
	
	private void pickBlock() {
		blocks.add(blocksAsArray[rand.nextInt(blocksAsArray.length)]);
	}
	
	public List<Punches> getPunches() {
		return punches;
	}
	
	public List<Blocks> getBlocks() {
		return blocks;
	}
	
	public List<Kicks> getKicks() {
		return kicks;
	}
}
