class Solution {
    public static int winner(int n ,int k,int person[],int personleft,int index){
      if(personleft==1){
          for(int i=0;i<n;i++){
           if(person[i]==0){
             return i;
           }
          
          }
      }
        int kill = (k-1) % personleft;
          while(kill>0){
             
              index = (index+1)%n;
             if(person[index]==0){
                  kill--;
                 
             } 
          }
      

        person[index]=1;  //mark 1 which we eliminate
          while(person[index]==1){
                  index= (index+1)%n;
              }
          return winner(n,k,person ,personleft-1,index);
    
    }
    public int findTheWinner(int n, int k) {
        int person[] = new int[n];
        for(int i=0;i<n;i++){
           person[i]=0;
        }
        return winner(n,k,person,n,0)+1;
        
    }
}
// class Solution {
//     public static int winner(int n ,int k ){
//         if(n==1){
//             return 0;
//         }
//         return (winner(n-1,k) + k)%n;
//     }
//     public int findTheWinner(int n, int k) {
//        return winner(n,k)+1;
        
//     }
// }