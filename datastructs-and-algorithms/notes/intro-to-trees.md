# Tree #
- tree is defined recursively
- a tree is a collection of nodes
  - the collection can be empty
  - if not empty, a tree consists of a node 'r', called the root, and 0 or more non-empty subtrees
  - each subtree's roots are connected by a directed edge from the 'r'
  - there will be a root node and N-1 edges
- parent node - the predecessor of another (child) node
- child node - the successor of another (parent) node
- root node - the topmost node of a tree
  - the node that doesn't have a parent node
- leaf node - a node that has no child nodes
- ancestor - any predecessor nodes on the path of the root of a node
- descendant - any successor nodes on from the leaf node to a node
- sibling - child nodes of the same parent
- level of a node - the number of edges on the path from the root to a node
- internal node - a node with at least one child
- neighbor - parent or child nodes of a node
- subtree - any node of a tree as well as its descendants

# Traversal #
- preorder
  - root comes first
  - root > left > right
- inorder
  - root is in the middle
  - left > root > right
- postorder
  - root comes last
  - left > right > root