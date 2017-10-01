package edu.csh.chase.osrs.cluescrolls.solver.models.clues

import edu.csh.chase.osrs.cluescrolls.solver.models.Emotes
import edu.csh.chase.osrs.cluescrolls.solver.models.Location

class EmoteClue(level: Level,
                location: Location,
                val emote: Emotes) : ClueScroll(level, location) {
}

/*
items,
doubleAgent?
secondEmote?


 */