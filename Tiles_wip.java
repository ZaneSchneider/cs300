//holds tile subclasses to be merged into tile file
//package company;

class Hazard extends Tile //randomize hazards and names?
{
    Hazard(){
         super(0, "hazard", 5);
    }
}

class Water extends Tile
{
    //need hero tool getter to test if hero has boat
    Water(){
        super(9, "water", 999);
    }
}
