package edu.csh.chase.osrs.cluescrolls.solver.models.travel

import edu.csh.chase.osrs.cluescrolls.solver.models.Location
import edu.csh.chase.osrs.cluescrolls.solver.models.Spells
import edu.csh.chase.osrs.cluescrolls.solver.models.items.Item
import edu.csh.chase.osrs.cluescrolls.solver.models.npcs.Npc

sealed class TravelMethod(val targetLocation: Location,
                          val name: String) {

    class MultiStep(tl: Location, name: String, val methods: List<TravelMethod>) : TravelMethod(tl, name)

    class FairyRing(tl: Location, name: String, val code: String) : TravelMethod(tl, name)
    //Map<Code, Location>

    class ItemTeleport(tl: Location, name: String, val item: Item) : TravelMethod(tl, name)
    //Map<MenuOption?, Location> || Map<Name, Location> || List<Location>

    class SpellTeleport(tl: Location, name: String, val spell: Spells) : TravelMethod(tl, name)

    class NpcTeleport(tl: Location, name: String, val npc: Npc) : TravelMethod(tl, name)
    //Map<Location, Location>
}


/*
Method - tele, fair ring, etc
Requirements - level, quests, items, favor, achievements
cost - carpets, rune prices ??

tele -> spell, item, npc

*/