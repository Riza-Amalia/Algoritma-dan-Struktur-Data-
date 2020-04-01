package Tugas3;
/**
 *
 * @author Riza Amalia Hariyanti
 */
public class Convert {   
        private Node top;
        
        public Convert() {
            top = null; 
        }
        
        public boolean empty(){
            return top == null; 
        }
        
        public boolean full(){
            return false;
        }

        public void push(Object e){
            Node tmp = new Node(e);
            tmp.next = top;
            top = tmp;
        }

        public Object pop(){
            Object e =  top.data;
            top = top.next;
            return e;
        }

        public Object peek(){
            Object e =  top.data;
            return e;
        }

        public void prefix(String x){
            String output="";
            Convert S = new Convert();
            int i;
            for(i=0;i<x.length();i++){
                char c=x.charAt(i);
                if(c==('+')||c==('*')||c==('-')||c==('/')){
                    while(!S.empty() && Prepriority(S.peek()) <= Prepriority(c))
                        output+=S.pop();
                        S.push(c);
                }
            }
            while(!S.empty()){
                output+=S.pop();
            }
            
            for(i=0;i<x.length();i++){
                char c=x.charAt(i);
                if(c==('+')||c!=('*')||c!=('-')||c!=('/')){
                    while(!S.empty() && Prepriority(S.peek()) >= Prepriority(c))
                        output+=S.pop();
                        S.push(c);
                }
                else {
                    output+=c;
                }    
                if((c=='(')||(c==')')){
                    S.pop();
                }
                if(c==('+')||c==('*')||c==('-')||c==('/')){
                    S.pop();
                }
            }
            while(!S.empty()){
                output+=S.pop();
            }
            
            System.out.println("Notasi Prefix\t\t: "+output);
        }
        
        public void postfix(String x){
        String output="";
        Convert S=new Convert();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c==('+')||c==('*')||c==('-')||c==('/')){
                while(!S.empty() && Postpriority(S.peek())>= Postpriority(c))
                    output+=S.pop();
                    S.push(c);
                }
            else if(c=='('){
                S.push(c);
            }
            else if(c==')'){
                while(!S.peek().equals('('))
                output+=S.pop();
                S.pop();
            }
            else
                output+=c;
        }
        while(!S.empty())
            output+=S.pop();
            System.out.println("Notasi Infix            : "+x);
            System.out.println("Notasi Postfix          : "+output);
        }

        public int Prepriority(Object x){
            if(x.equals('+')||x.equals('-')){
                return 2;
            }
            else if(x.equals('*')||x.equals('/')){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        public int Postpriority(Object x){
            if(x.equals('+')||x.equals('-'))
                return 1;
            else if(x.equals('*')||x.equals('/'))
                return 2;
            else
                return 0;
        }
}

