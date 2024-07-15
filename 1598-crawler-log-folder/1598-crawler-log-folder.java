class Solution {
  public int minOperations(String[] logs) {
      Deque<String> stack = new LinkedList<>();
      for (String log : logs) {
          if (log.equals("../")) {
              if (!stack.isEmpty()) {
                  stack.pollLast();
              }
          } else if (!log.equals("./")) {
              stack.offerLast(log);
          }
      }
      return stack.size();
  }
}