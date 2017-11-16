package edu.csh.chase.osrs.cluescrolls.solver.models

import edu.csh.chase.osrs.cluescrolls.solver.models.requirements.Requirement

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