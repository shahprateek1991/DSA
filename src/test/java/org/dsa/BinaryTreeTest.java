package org.dsa;

import org.dsa.BinaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void shouldTraverseTreeWithInOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20), new Node<>(30,
                new Node<>(40), new Node<>(50))));
        assertEquals(List.of(20, 10, 40, 30, 50), tree.inOrderTraversal());
    }

    @Test
    void shouldTraverseTreeWithPreOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20), new Node<>(30,
                new Node<>(40), new Node<>(50))));
        assertEquals(List.of(10, 20, 30, 40, 50), tree.preOrderTraversal());
    }

    @Test
    void shouldTraverseTreeWithPostOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20), new Node<>(30,
                new Node<>(40), new Node<>(50))));
        assertEquals(List.of(20, 40, 50, 30, 10), tree.postOrderTraversal());
    }

    @Test
    void shouldReturnHeightOfTheTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20), new Node<>(30,
                new Node<>(40), new Node<>(50))));
        assertEquals(3, tree.height());
    }

    @Test
    void shouldReturnNodesAtKDistance() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20), new Node<>(30,
                new Node<>(40), new Node<>(50))));
        assertEquals(List.of(40, 50), tree.nodesAt(2));
        assertEquals(List.of(20, 30), tree.nodesAt(1));
        assertEquals(List.of(10), tree.nodesAt(0));
        assertEquals(List.of(), tree.nodesAt(3));
    }

    @Test
    void shouldReturnBFSTraversalOfTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(new Node<>(10,
                new Node<>(20, new Node<>(8),
                        new Node<>(7, new Node<>(9),
                                new Node<>(15))),
                new Node<>(30, new Node<>(6), null)));

        assertEquals(List.of(10, 20, 30, 8, 7, 6, 9, 15), tree.bfs());
    }

    @Test
    void shouldCheckForChildrenSumProperty() {
        Node<Integer> root = new Node<>(10,
                new Node<>(20, new Node<>(8),
                        new Node<>(7, new Node<>(9),
                                new Node<>(15))),
                new Node<>(30, new Node<>(6), null));
        assertFalse(BinaryTree.isChildrenSumPropertyApplicable(root));

        Node<Integer> root2 = new Node<>(10,
                new Node<>(8, new Node<>(5),
                        new Node<>(3, new Node<>(2),
                                new Node<>(1))),
                new Node<>(2, new Node<>(2), null));
        assertTrue(BinaryTree.isChildrenSumPropertyApplicable(root2));
    }

    @Test
    void shouldCheckForBalancedTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(
                new Node<>(18,
                        new Node<>(4),
                        new Node<>(20,
                                new Node<>(13),
                                new Node<>(70)
                        )
                )
        );
        assertTrue(tree.isBalanced());

        BinaryTree<Integer> tree2 = new BinaryTree<>(
                new Node<>(3,
                        new Node<>(4, new Node<>(5), null),
                        null
                )
        );
        assertFalse(tree2.isBalanced());
    }
}