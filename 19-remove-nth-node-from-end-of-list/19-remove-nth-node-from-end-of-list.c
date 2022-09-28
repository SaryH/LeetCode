/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    int size=1;
    struct ListNode* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
        size++;
    }
    if(size<=1)
        return NULL;
    temp=head;
    int location=size-n+1;
    struct ListNode* prev;
    if(location==1)
        return head->next;
    else{
    for(int i=1;i<=location-1;i++){
        if(i==location-1)
            prev=temp;
        temp=temp->next;
    }
    
    prev->next=prev->next->next;
    return head;
    }
}