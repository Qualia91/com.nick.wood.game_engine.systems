package com.boc_dev.lge_systems.generation;

import java.util.ArrayList;

public class RecBackTrackReturnValue {
	private final Cell cell;
	private final ArrayList<Cell> neighbours;

	public RecBackTrackReturnValue(Cell cell, ArrayList<Cell> neighbours) {
		this.cell = cell;
		this.neighbours = neighbours;
	}

	public Cell getCell() {
		return cell;
	}

	public ArrayList<Cell> getNeighbours() {
		return neighbours;
	}
}
