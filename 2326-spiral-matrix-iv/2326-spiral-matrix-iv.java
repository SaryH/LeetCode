/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix=new int[m][n];
        int rowMin=0,rowMax=m-1,colMin=0,colMax=n-1;
        for(int[] temp:matrix){
            Arrays.fill(temp,-1);
        }
        while(head!=null){
            for(int i=colMin;i<=colMax && head!=null;i++){
                matrix[rowMin][i]=head.val;
                head=head.next;
            }
            rowMin++;
            for(int i=rowMin;i<=rowMax && head!=null;i++){
                matrix[i][colMax]=head.val;
                head=head.next;
            }
            colMax--;
            if(rowMin>rowMax || colMax<colMin)
                break;
            for(int i=colMax;i>=colMin && head!=null;i--){
                matrix[rowMax][i]=head.val;
                head=head.next;
            }
            rowMax--;
            for(int i=rowMax;i>=rowMin && head!=null;i--){
                matrix[i][colMin]=head.val;
                head=head.next;
            }
            colMin++;
        }
        return matrix;
    }
}