package edu.csh.chase.osrs.cluescrolls.solver.models.clues

import edu.csh.chase.osrs.cluescrolls.solver.models.Emotes
import edu.csh.chase.osrs.cluescrolls.solver.models.Location
import edu.csh.chase.osrs.cluescrolls.solver.models.loadout.Loadout

class EmoteClue(level: Level,
                location: Location,
                val loadout: Loadout,
                val task: Task) : ClueScroll(level, location) {

    sealed class Task(val emote: Emotes) {
        class Emote(emote: Emotes) : Task(emote)
        class DoubleAgent(emote: Emotes) : Task(emote)
        class DoubleEmote(emote1: Emotes, val emote2: Emotes) : Task(emote1)
    }

}

/*
items,
doubleAgent?
secondEmote?


 */