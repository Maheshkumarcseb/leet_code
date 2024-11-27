package leet_code.STACK;
import java.util.Stack;

class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for (int i = 0; i < p.length; i++) {
            if (!s.isEmpty() && p[i].equals(".."))
                s.pop();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }
        if (s.isEmpty())
            return "/";
        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        SimplifyPath solution = new SimplifyPath();
        
        // Test cases
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";
        String path5 = "/a/../../b/../c//.//";
        String path6 = "/a//b////c/d//././/..";

        // Outputs
        System.out.println("Input: " + path1 + " -> Output: " + solution.simplifyPath(path1));
        System.out.println("Input: " + path2 + " -> Output: " + solution.simplifyPath(path2));
        System.out.println("Input: " + path3 + " -> Output: " + solution.simplifyPath(path3));
        System.out.println("Input: " + path4 + " -> Output: " + solution.simplifyPath(path4));
        System.out.println("Input: " + path5 + " -> Output: " + solution.simplifyPath(path5));
        System.out.println("Input: " + path6 + " -> Output: " + solution.simplifyPath(path6));
    }
}
