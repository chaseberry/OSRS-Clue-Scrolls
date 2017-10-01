package edu.csh.chase.osrs.cluescrolls.solver.models.clues

import edu.csh.chase.osrs.cluescrolls.solver.models.Challenge
import edu.csh.chase.osrs.cluescrolls.solver.models.Level
import edu.csh.chase.osrs.cluescrolls.solver.models.Location
import edu.csh.chase.osrs.cluescrolls.solver.models.npcs.Npc

class AnagramClue(level: Level,
                  location: Location,
                  val anagram: String,
                  val npc: Npc,
                  val challenge: Challenge) : ClueScroll(level, location) {


}