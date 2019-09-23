package kosta.mission;

	class ThreeArrays {
	    static int arr1[];
	    static {
	        arr1 = new int[10];                   
	        for (int cnt = 0; cnt < 10; cnt++)    
	            arr1[cnt] = cnt + 1;
	    }
	    static int arr2[];
	    static {
	        arr2 = new int[10];                   
	        for (int cnt = 0; cnt < 10; cnt++)    
	            arr2[cnt] = (cnt + 1) * 10000;
	    }
	    static int arr3[];
	    static {
	        arr3 = new int[10];                   
	        for (int cnt = 0; cnt < 10; cnt++)    
	            arr3[cnt] = arr1[cnt] + arr2[cnt];
	    }
	}

