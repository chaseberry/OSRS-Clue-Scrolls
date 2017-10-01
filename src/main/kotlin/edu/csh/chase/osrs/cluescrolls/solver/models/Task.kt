package edu.csh.chase.osrs.cluescrolls.solver.models

import edu.csh.chase.osrs.cluescrolls.solver.models.npcs.Npc

sealed class Task {
    class Dig : Task()
    class Speak(val npc: Npc) : Task()//TODO see if I can confirm it's single or generic
    class Search() : Task()//TODO Objects pls
    class Kill(val npc: Npc.Enemy) : Task()
    class PuzzleBox(val npc: Npc) : Task()
    class Key(val npc: Npc) : Task()//TODO Object
}

/*

dig, //
    speak, //,npc
    search, //, object
    kill, //, npc
    puzzleBox, //, npc
    key /*
        , object
        npc, location?

    */
 */