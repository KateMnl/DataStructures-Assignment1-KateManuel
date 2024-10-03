package Adventures;

public class ClueTree {

    private class Node {
        String clue;
        Node left, right;

        Node(String clue) {
            this.clue = clue;
            left = right = null;
        }
    }

    private Node root;

    public ClueTree() {
        root = null;
    }

    public void insert(String clue) {
        root = insertRec(root, clue);
    }

    private Node insertRec(Node root, String clue) {
        if (root == null) {
            root = new Node(clue);
            return root;
        }
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRec(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRec(root.right, clue);
        }
        return root;
    }

    public void inOrder() {
        System.out.print("In-order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.clue + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        System.out.print("Pre-order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.clue + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        System.out.print("Post-order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.clue + " ");
        }
    }

    public boolean findClue(String clue) {
        return findClueRec(root, clue);
    }

    private boolean findClueRec(Node root, String clue) {
        if (root == null) {
            return false;
        }
        if (root.clue.equals(clue)) {
            return true;
        }
        if (clue.compareTo(root.clue) < 0) {
            return findClueRec(root.left, clue);
        } else {
            return findClueRec(root.right, clue);
        }
    }

    public int countClues() {
        return countCluesRec(root);
    }

    private int countCluesRec(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countCluesRec(root.left) + countCluesRec(root.right);
    }

    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        clueTree.insert("Clue A");
        clueTree.insert("Clue B");
        clueTree.insert("Clue C");
        clueTree.insert("Clue D");
        clueTree.insert("Clue E");

        clueTree.inOrder();
        clueTree.preOrder();
        clueTree.postOrder();

        System.out.println("Is 'Clue C' in the tree? " + clueTree.findClue("Clue C"));
        System.out.println("Is 'Clue Z' in the tree? " + clueTree.findClue("Clue Z"));

        System.out.println("Total number of clues in the tree: " + clueTree.countClues());
    }
}
