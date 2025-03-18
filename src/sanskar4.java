import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sanskar4 {
    private static final double PI = Math.acos(-1.0);

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        double[] A =new double[n];
        double[] B = new double[n];
        for(int i=0; i<n;++i){
            A[i] = scanner.nextDouble();
        }
        for(int i=0; i<n;++i){
            B[i] = scanner.nextDouble();
        }

        final double dx =0.0001;
        final int N = (int) ((2*PI) / dx)+1;

        double[] Y = new double[N];
        double[] X = new double[N];
        for(int i=0; i<N;++i){
            double x=i*dx;
            X[i]=x;
            double y=0.0;
            for(int j=0;j<n;++j){
                y += Math.sin(A[j]* x + B[j]);
            }
            Y[i]=y;
        }

        List<Double> peaks = new ArrayList<>();
        List<Integer> peakIndices =new ArrayList<>();
        for(int i=1;i<N-1;++i){
            if(Y[i] > Y[i-1] && Y[i]>Y[i+1]){
                peaks.add(X[i]);
                peakIndices.add(i);
            }
        }
        if (Y[0] > Y[1]){
            peaks.add(0,X[0]);
            peakIndices.add(0,0);
        }
        if (Y[N-1] > Y[N-2]){
            peaks.add(X[N-1]);
            peakIndices.add(N-1);
        }

        int numValleys =peaks.size()-1;
        if(numValleys <=0){
            System.out.println(1);
            return;
        }

        double maxWidth =0.0;
        int valleyIndex =1;
        for(int i=0;i<numValleys;++i){
            double width =peaks.get(i+1) - peaks.get(i);
            if (width > maxWidth) {
                maxWidth = width;
                valleyIndex = i+1;
            }
        }

        System.out.print(valleyIndex);
    }
}
