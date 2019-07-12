package me.cherry.unionfind;

public class UnionFind {

  public static void main(String[] arg) {
    UnionStore store = new UnionStore(10);

    store.union(1, 2);
    store.connected(1, 7);
    store.union(5, 7);
    store.union(5, 3);
    store.union(3, 9);
    store.union(3, 0);
    store.union(0, 4);
    store.union(4, 7);
    store.union(7, 8);
    store.union(1, 8);
    store.connected(0, 2);
  }
}
