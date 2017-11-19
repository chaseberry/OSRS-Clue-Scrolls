package edu.csh.chase.osrs.cluescrolls.solver.models.magic

import edu.csh.chase.osrs.cluescrolls.solver.models.Skills
import edu.csh.chase.osrs.cluescrolls.solver.models.requirements.Requirement

//consider sealed class with subtype for damage/tele/etc to give more info
enum class Spells(level: Int, val spellBook: SpellBooks) {

    //standard
    windStrike(1, SpellBooks.standard),
    confuse(3, SpellBooks.standard)

    //lunar

    //ancient

    //arceuus

    ;

    val level = Requirement.Skill(Skills.magic, level)
}


/*
combat - singletarget, aoe, cc, leveldrain(percent, flat), heal, cure poison, poison, heal, thorns, potion(stat, restore, boost)
enchantment - orb, bolt, jewellery
necromancy (npc, prayer xp)
skilling - createItem, convertItem, communicateNpc,
teleport - aoe, self, other
 */