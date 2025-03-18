public class toh
{
    // JAVA recursive function to
// solve tower of hanoi puzzle


        static void towerOfHanoi(int n, char from_rod,
                                 char to_rod, char aux_rod1 )
        {
            if (n == 0) {
                return;
            }
            towerOfHanoi(n - 1, from_rod, aux_rod1, to_rod);
            System.out.println("Move disk " + n + " from rod "
                    + from_rod + " to rod " + to_rod);
            towerOfHanoi(n - 1, aux_rod1, to_rod, from_rod);
        }

        // Driver code
        public static void main(String[] args)
        {

             int N=3;
            // A, B,C  are names of rods
            towerOfHanoi(N,'A', 'C', 'B');
        }
    }



