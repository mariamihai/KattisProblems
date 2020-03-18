package difficulty_2.difficulty_2_4.TRIED_iWannaBeTheVeryBest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IWannaBeTheVeryBest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrPokemons = scanner.nextInt();
        int kHighestPokemons = scanner.nextInt();

        List<Pokemon> pokemons = new ArrayList<>();
        for(int i = 0; i < nrPokemons; i++) {
            pokemons.add(new Pokemon(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        List<Pokemon> highestPokemonsList = new ArrayList<>();
        highestPokemonsList.addAll(reverseSortedByStat(pokemons, kHighestPokemons, IWannaBeTheVeryBest::getAttack));
        highestPokemonsList.addAll(reverseSortedByStat(pokemons, kHighestPokemons, IWannaBeTheVeryBest::getDefense));
        highestPokemonsList.addAll(reverseSortedByStat(pokemons, kHighestPokemons, IWannaBeTheVeryBest::getHealth));

        System.out.println(highestPokemonsList.stream().distinct().count());

        scanner.close();
    }

    private static List<Pokemon> reverseSortedByStat(List<Pokemon> pokemons, int kHighestPokemons, Function<Pokemon, Integer> function) {
        return pokemons.stream()
                .sorted(Comparator.comparing(function).reversed())
                .limit(kHighestPokemons)
                .collect(Collectors.toList());
    }

    private static Integer getAttack(Pokemon pokemon) {
        return pokemon.getAttack();
    }

    private static Integer getDefense(Pokemon pokemon) {
        return pokemon.getDefence();
    }

    private static Integer getHealth(Pokemon pokemon) {
        return pokemon.getHealth();
    }
}
