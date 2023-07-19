public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusMiles;
        int bonus = 20;
        bonusMiles = ticketPrice / bonus;
        return bonusMiles;
    }
}

