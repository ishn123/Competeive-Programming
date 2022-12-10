import java.io.*;
import java.util.StringTokenizer;
public class WordSearchII {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("E:\\USACO_AND_CP\\in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("E:\\USACO_AND_CP\\out.txt"));
		StringTokenizer st = new StringTokenizer(r.readLine());
		pw.write(st.nextToken());
		pw.close();
	}
}