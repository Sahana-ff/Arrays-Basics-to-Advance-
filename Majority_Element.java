int majorityElement(int arr[]) {
        // code here
        int element=arr[0];
        int count=0;
        
        for(int num:arr){
            if(count==0) element=num;
            
            if(element==num) count++;
            else count--;
        }
        return element;
    }
