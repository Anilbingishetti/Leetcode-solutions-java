class Spreadsheet {
    int row;
    HashMap<String, Integer> map;

    public Spreadsheet(int rows) {
        this.row = rows;
        this.map = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        map.put(cell, value);
    }

    public void resetCell(String cell) {
        map.put(cell, 0);
    }

    private int resolveValue(String token) {
    if (map.containsKey(token)) {
        return map.get(token);
    }
    try {
        return Integer.parseInt(token);
    } catch (NumberFormatException e){
        return 0;
    }
}

public int getValue(String formula) {
    String[] str = formula.split("\\+");
    String s1 = str[0];
    if (s1.startsWith("=")) {
        s1 = s1.substring(1);
    }
    String s2 = str[1];

    int x1 = resolveValue(s1);
    int x2 = resolveValue(s2);

    return x1 + x2;
}

}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */