/*--------------Brute force------------------*/
// int n = a.length;
        // int m = b.length;
        // long c[] = new long[n+m];
        // int leftPointer = 0;
        // int rightPointer = 0;
        // int index = 0;
        // while(leftPointer < n && rightPointer < m){
        //     if(a[leftPointer] <= b[rightPointer]){
        //         c[index] = a[leftPointer];
        //         index++;
        //          leftPointer++;
        //     }
        //     else{
        //         c[index] = b[rightPointer];
        //         rightPointer++;
        //         index++;
        //     }
        // }
        // while(leftPointer < n){
        //     c[index++] =a[leftPointer++];
        // }
        // while(rightPointer < m){
        //     c[index++] = b[rightPointer++];
        // }

        // for(int i=0;i<n+m;i++){
        //     if(i<n) a[i] = c[i];
        //     else b[i-n] = c[i];
        // }

        /*-----------Optimal Solution-----------*/

        int n = a.length;
        int m = b.length;
       
        int leftPointer= n-1; //largest element
        int rightPointer =0; //smallest element
        
        while(leftPointer >=0 && rightPointer < m){
            if(a[leftPointer] > b[rightPointer]){
                long temp = a[leftPointer];
                a[leftPointer] = b[rightPointer];
                b[rightPointer] = temp;
                leftPointer--;
                rightPointer++;

            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
