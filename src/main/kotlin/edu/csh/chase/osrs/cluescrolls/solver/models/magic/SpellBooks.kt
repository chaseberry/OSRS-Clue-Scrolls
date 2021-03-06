package edu.csh.chase.osrs.cluescrolls.solver.models.magic

import edu.csh.chase.osrs.cluescrolls.solver.models.Houses
import edu.csh.chase.osrs.cluescrolls.solver.models.Quest
import edu.csh.chase.osrs.cluescrolls.solver.models.requirements.Requirement

enum class SpellBooks(val requirement: Requirement?) {

    standard(null),
    lunar(Requirement.Quest(Quest.lunarDiplomacy)),
    ancient(Requirement.Quest(Quest.desertTreasure)),
    arceuus(Requirement.Favor(Houses.arceuss, 60))
}