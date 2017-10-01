package edu.csh.chase.osrs.cluescrolls.solver.models.npcs

import edu.csh.chase.osrs.cluescrolls.solver.models.Location

sealed class Npc(val name: String) {

    class Unique(name: String, val location: Location) : Npc(name)

    class Multi(name: String) : Npc(name)

    class Enemy(name: String, val level: Int) : Npc(name)//TODO multi location or list
}