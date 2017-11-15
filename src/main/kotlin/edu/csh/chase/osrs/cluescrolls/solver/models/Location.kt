package edu.csh.chase.osrs.cluescrolls.solver.models

import edu.csh.chase.osrs.cluescrolls.solver.models.requirements.Requirement

class Location(val name: String,
               val requirements: List<Requirement>,
               val x: Int,
               val y: Int,
               val z: Int) {//TODO single vs region
}

/*
Requirements to go here?
Description
Coordinates
Travel Methods
Picture / map view -- might be specific to UI
 */


/*
Region,
Area
id


 */