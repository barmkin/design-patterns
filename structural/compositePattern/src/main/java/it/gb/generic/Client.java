package it.gb.generic;

public abstract class Client {

  public static void executeGeneric() {

    Composite treeRoot = new Composite("root");
    
    Composite leftBranch = new Composite("left");
    Composite rightBranch = new Composite("right");
    treeRoot.add(leftBranch);
    treeRoot.add(rightBranch);

    Composite leftSubBranchA = new Composite("leftSubA");
    Composite leftSubBranchB = new Composite("leftSubB");
    leftBranch.add(leftSubBranchA);
    leftBranch.add(leftSubBranchB);

    Leaf rightLeafA = new Leaf("leafA");
    Leaf rightLeafB = new Leaf("leafB");
    rightBranch.add(rightLeafA);
    rightBranch.add(rightLeafB);

    Leaf leftSubBranchALeafA = new Leaf("leafA");
    leftSubBranchA.add(leftSubBranchALeafA);

    Leaf leftSubBranchBLeafA = new Leaf("leafA");
    Leaf leftSubBranchBLeafB = new Leaf("leafB");
    Leaf leftSubBranchBLeafC = new Leaf("leafC");
    leftSubBranchB.add(leftSubBranchBLeafA);
    leftSubBranchB.add(leftSubBranchBLeafB);
    leftSubBranchB.add(leftSubBranchBLeafC);

    treeRoot.execute();    
  }

}
