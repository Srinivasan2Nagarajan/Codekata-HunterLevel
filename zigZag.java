public void ZigZagPrint(Node node) { 
boolean LR = true; 
Stack<Node> pStack = new Stack<Node>(); 
pStack.push(node); 
ZigZag(pStack,LR); 
} 
public void ZigZag(Stack<Node> Parent,boolean LR){ 
Stack<Node> Child = new Stack<Node>(); 
if (Child.isEmpty() &&Parent.isEmpty())return; 
while (!Parent.isEmpty()) { 
Node temp = Parent.pop(); 
System.out.print(temp.data+" , "); 
if (LR) { 
if (temp.leftChild != null) Child.push(temp.leftChild); 
if (temp.rightChild != null)Child.push(temp.rightChild); 
} else { 
if (temp.rightChild != null) Child.push(temp.rightChild); 
if (temp.leftChild != null) Child.push(temp.leftChild); 
} 
} 
Parent=Child; 
System.out.println(); 
ZigZag( Parent, !LR); 
} 

