public static Integer[] outputSinglePair(Integer[] numbers){  
        if(numbers == null)  
            throw new IllegalArgumentException();  

        Arrays.sort(numbers);  
        ArrayList<Integer> result = new ArrayList<Integer>();  
        for(int i = 0; i < numbers.length - 1; ){  
            if(numbers[i] != numbers[i + 1]){  
                result.add(numbers[i]);  
                i++;                
            }     
            else  
                i+=2;  
            if(i == numbers.length - 1)result.add(numbers[i]);//we hit last element of array which is unpaired
        }  
        return result.toArray(new Integer[0]);  
    }  
