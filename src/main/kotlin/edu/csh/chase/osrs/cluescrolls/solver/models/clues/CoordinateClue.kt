package edu.csh.chase.osrs.cluescrolls.solver.models.clues

import edu.csh.chase.osrs.cluescrolls.solver.models.Level
import edu.csh.chase.osrs.cluescrolls.solver.models.Location

class CoordinateClue(level: Level,
                     location: Location,
                     val coordinates: String) : ClueScroll(level, location) {//TODO parsed/shorthand version maybe for querying
}