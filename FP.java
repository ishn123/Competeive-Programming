import java.io.*;
import java.util.StringTokenizer;
static boolean seive(int n){
	boolean[] seive = new boolean[n+1];
	for(int i=0;i<n+1;i++){
		seive[i] = true;
	}
	seive[0] = false;
	seive[1] = false;
	for(int i=2;i*i<=n;i++){
		if(!seive[i])continue;
		int j = i*i;
		while(j<=n){
			seive[j] = false;
			j+=i;
			}
		}
	}
static int fact(int n){
	int[] fact = new int[n+1];
	fact[0] = 1;
	fact[1] = 1;
	int MOD = 1000000007;
	for(int i=2;i<=n;i++){
		fact[i] = (i*dp[i-1])%MOD;
	}
	return fact[n];
}
static int invfact(int n){
	int[] inv = new int[n+1];
	inv[0] = 1;
	inv[1] = 1;
	for(int i=2;i<=n;i++){
		inv[i] = power(fact(i),MOD-1)%MOD;
 	}
 	return inv[n];
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		pw.write(invfact(6));
	}
}
