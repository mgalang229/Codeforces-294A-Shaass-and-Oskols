import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int a[] = new int[n+2];
			for(int i=1; i<=n; ++i)
				a[i]=in.nextInt();
			int m=in.nextInt();
			for(int i=1; i<=m; ++i) {
				int x=in.nextInt(), y=in.nextInt();
				a[x-1]+=(y-1);
				a[x+1]+=(a[x]-y);
				a[x]=0;
			}
			for(int i=1; i<=n; ++i)
				out.println(a[i]);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
