package edu.csh.chase.osrs.cluescrolls.solver.models.travel

import edu.csh.chase.osrs.cluescrolls.solver.models.Location
import edu.csh.chase.osrs.cluescrolls.solver.models.items.Item

sealed class TravelMethod(val targetLocation: Location,
                          val name: String) {

    class MultiStep(tl: Location, name: String, val methods: List<TravelMethod>) : TravelMethod(tl, name)

    class FairyRing(tl: Location, name: String, val code: String) : TravelMethod(tl, name)

    class ItemTeleport(tl: Location, name: String, val item: Item) : TravelMethod(tl, name)

    class SpellTeleport(tl: Location, name: String) : TravelMethod(tl, name)
}


/*
Method - tele, fair ring, etc
Requirements - level, quests, items, favor, achievements
cost - carpets, rune prices ??

tele -> spell, item, npc

*/