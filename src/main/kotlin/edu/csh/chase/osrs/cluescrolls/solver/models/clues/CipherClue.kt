package edu.csh.chase.osrs.cluescrolls.solver.models.clues

import edu.csh.chase.osrs.cluescrolls.solver.models.Challenge
import edu.csh.chase.osrs.cluescrolls.solver.models.Level
import edu.csh.chase.osrs.cluescrolls.solver.models.Location
import edu.csh.chase.osrs.cluescrolls.solver.models.npcs.Npc

class CipherClue(level: Level,
                 location: Location,
                 val cipher: String,
                 val npc: Npc,
                 val challenge: Challenge) : ClueScroll(level, location) {


}