package edu.csh.chase.osrs.cluescrolls.solver.models.requirements

import edu.csh.chase.osrs.cluescrolls.solver.models.Houses
import edu.csh.chase.osrs.cluescrolls.solver.models.Skills

sealed class Requirement {

    class Skill(val skill: Skills, val level: Int) : Requirement()

    class Favor(val house: Houses, val amount: Int) : Requirement()

}