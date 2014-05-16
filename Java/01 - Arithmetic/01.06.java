/*
 * Copyright (C) 2014 Stefan Hahn
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
 
/**
 * Game Score: 1/3
 */
public class Program {
	public static int Puzzle(int x) {
		return (Math.abs(x) > 4) ? 0 : (-x + ((Math.abs(x) == 1 || (Math.abs(x) == 4) ? 5 : 4)) * Math.signum(x));
	}
}