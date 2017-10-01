package edu.csh.chase.osrs.cluescrolls.solver.models

sealed class Challenge() {

    class None() : Challenge()
    class Simple(val answer: String) : Challenge()
    class PuzzleBox() : Challenge()
    class LightOrPuzzleBox() : Challenge()

}