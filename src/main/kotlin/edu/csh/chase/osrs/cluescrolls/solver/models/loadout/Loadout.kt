package edu.csh.chase.osrs.cluescrolls.solver.models.loadout

import edu.csh.chase.osrs.cluescrolls.solver.models.items.Item

class Loadout {

    private val loadout = HashMap<LoadoutSlots, Item?>()

    init {
        LoadoutSlots.values().forEach {
            loadout[it] = null
        }
    }
}