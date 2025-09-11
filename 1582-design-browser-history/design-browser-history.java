class BrowserHistory {
     Stack<String> frwd;
     Stack<String> back;
    public BrowserHistory(String homepage) {
        this.frwd = new Stack<>();
        this.back = new Stack<>();
        back.push(homepage);
    }
    
    public void visit(String url) {
        back.push(url);
        frwd.clear();
   }
    
    public String back(int steps) {
        while (steps > 0 && back.size() > 1) {
            frwd.push(back.pop());
            steps--;
        }
        return back.peek();
    }
    
    public String forward(int steps) {
         while (steps > 0 && !frwd.isEmpty()) {
            back.push(frwd.pop());
            steps--;
        }
        return back.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistoif(ry obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */