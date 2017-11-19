package edu.csh.chase.osrs.cluescrolls.solver.models.magic

sealed class SpellType {

    class Combat() : SpellType()

    class Enchantment : SpellType()

    class Necromancy : SpellType()

    class Skilling : SpellType()

    class Teleport : SpellType()
}