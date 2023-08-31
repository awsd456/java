package com.green.java.memojang;

import java.util.*;

public class OOOOO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();
        String s = scan.next();
        List list = new LinkedList();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        char c;
        int idx=0;
        for (int i = 0; i < s.length(); i++) {
            if(ch[i]=='('){
                while(true){
                    if(ch[i]==')'){
                        break;
                    }
                    i++;
                }
            }
            else if (ch[i] == '*' || ch[i] == '/') {
                
                list.add(ch[i + 1]);
                list.add(ch[i]);
                i++;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                list.add(ch[i]);
            }
        }
            for (int i = 0; i < list.size(); i++) {
                if(ch[i]=='+'||ch[i]=='-'){
                    idx=i;
                    while(idx< list.size()){
                        if(ch[idx]=='*'||ch[idx]=='/'){
                            list.add(idx+1,ch[i]);
                            break;
                        }
                        idx++;
                    }
                }
            }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        }
 }
