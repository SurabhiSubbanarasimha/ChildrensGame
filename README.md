# ChildrensGame

This children's game works in the following way:
• ’n’ children stand around a circle.
• Staring with a given child and working clockwise, each child gets a
sequential number, which we will refer to as the child’s ‘id’
• Then starting with the first child, they count from 1 until ‘k’, where ‘k’ is
determined at the start of the game. The child who counts ‘k’ is now out and
leaves the circle. The count starts again with the child immediately next to the
eliminated one.
• Children are so removed from the circle one by one. The winner is the child
left standing last.

The program accepts 2 inputs, the value of 'n' and 'k' and returns the sequence in which the children get out. It also indicates the winning id of the child.

Please note : The program expects n>0 and 0<k<=n values to run successfully. Else the program needs to be re-run with the right values.
