package org.evertree.lettres.piece;

import java.awt.Point;
import java.util.ArrayList;

import org.evertree.lettres.resource.Colors;

public class PieceT extends Piece {

	private static final Point[][] deltas = new Point[][] {
			{ p(+1, +1), p(+0, +0), p(-1, -1), p(+1, -1) },
			{ p(+1, -1), p(+0, +0), p(-1, +1), p(-1, -1) },
			{ p(-1, -1), p(+0, +0), p(+1, +1), p(-1, +1) },
			{ p(-1, +1), p(+0, +0), p(+1, -1), p(+1, +1) } };

	public PieceT() {
		blocks = new ArrayList<Block>();
		blocks.add(new Block(0, 0, Colors.DARK_BLUE));
		blocks.add(new Block(1, 0, Colors.DARK_BLUE));
		blocks.add(new Block(2, 0, Colors.DARK_BLUE));
		blocks.add(new Block(1, 1, Colors.DARK_BLUE));
		orientation = 0;
	}

	@Override
	protected Point[][] getDeltas() {
		return deltas;
	}

	@Override
	protected Point getLeftCorner() {
		switch (orientation) {
		case 0:
			return p(blocks.get(0).getX(), blocks.get(0).getY());
		case 1:
			return p(blocks.get(2).getX(), blocks.get(2).getY());
		case 2:
			return p(blocks.get(2).getX(), blocks.get(3).getY());
		case 3:
			return p(blocks.get(3).getX(), blocks.get(0).getY());
		}
		return null;
	}

}
