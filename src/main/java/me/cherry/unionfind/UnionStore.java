package me.cherry.unionfind;

class UnionStore {

  private int[] id;

  UnionStore(int count) {
    id = new int[count];
    for (int i = 0; i < id.length; i++) {
      id[i] = i;
    }
  }

  void union(int a, int b) {
    checkArgument(a);
    checkArgument(b);
    System.out.println("unite " + a + " and " + b);

    int rootA = root(a);
    int rootB = root(b);
    id[rootA] = rootB;
  }

  boolean connected(int a, int b) {
    checkArgument(a);
    checkArgument(b);
    boolean connected = root(a) == root(b);
    System.out.println(a + " and " + b + " is " + (connected ? "" : "not ") + "connected");
    return connected;
  }

  private int root(int a) {
    int root = a;
    while (root != id[root]) {
      id[root] = id[id[root]];
      root = id[root];
    }
    return root;
  }

  private void checkArgument(int arg) {
    if (arg >= id.length) {
      throw new IllegalArgumentException(
          "wrong item " + arg + ". Store only contains elements up to " + (id.length - 1)
      );
    }
  }
}
