class FoodRatings {
    HashMap<String, TreeSet<String>> cuisineMap;
    HashMap<String, String> foodCuisine;
    HashMap<String, Integer> foodRating;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cuisineMap = new HashMap<>();
        foodCuisine = new HashMap<>();
        foodRating = new HashMap<>();

        int n = foods.length;
        for (int i = 0; i < n; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodCuisine.put(food, cuisine);
            foodRating.put(food, rating);

            cuisineMap.putIfAbsent(cuisine, new TreeSet<>(
                (a, b) -> {
                    int cmp = foodRating.get(b) - foodRating.get(a);
                    if (cmp == 0) return a.compareTo(b);
                    return cmp;
                }
            ));

            cuisineMap.get(cuisine).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        TreeSet<String> set = cuisineMap.get(cuisine);
        set.remove(food);
        foodRating.put(food, newRating);
        set.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first();
    }
}
