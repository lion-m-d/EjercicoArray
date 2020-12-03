package com.array.app.service;

import org.springframework.stereotype.Service;

import com.array.app.util.ErrorHandler;

@Service
public class ServiceArrayImpl implements ServiceArray{

	@Override
	public int[][] array(int[][] array) throws ErrorHandler {
		
			int[][] n = array; 
			int[][] n2 = new int[2][2]; 
			int[][] n3 = new int [3][3];
			
			if(validation(n) == 4) {
				
			for(int i = 0 ; i < n.length; i++) {
				
				for(int j = 0 ; j < n.length; j++) {
					
					switch (i) {
					case 0:
						switch (j) {
						case 0:
							
							n2[i][j] = n[i][j+1];
							break;
						case 1:
							n2[i][j] = n[i+1][j];
							break;
						}
						break;
					case 1:
						switch (j) {
						case 0:
							n2[i][j] = n[i-1][j];
							break;
						case 1:
							n2[i][j] = n[i][j-1];
							break;
						}
						
						break;
					}
					
				}
			}
					
			return n2;
			
		}else if(validation(n) == 9) {
			for(int i = 0 ; i < n.length; i++) {
				
				for(int j = 0 ; j < n.length; j++) {
					
					switch (i) {
					case 0:
						switch (j) {
						case 0:
							
							n3[i][j] = n[i][j+2];
							break;
						case 1:
							n3[i][j] = n[i+1][j+1];
							break;
						case 2:
							n3[i][j] = n[i+2][j];
							break;
						}
						break;
					case 1:
						switch (j) {
						case 0:
							n3[i][j] = n[i-1][j+1];
							break;
						case 1:
							n3[i][j] = n[i][j];
							break;
						case 2:
							n3[i][j] = n[i+1][j-1];
							break;
						}
						
						break;
						
					case 2:
						switch (j) {
						case 0:
							n3[i][j] = n[i-2][j];
							break;
						case 1:
							n3[i][j] = n[i-1][j-1];
							break;
						case 2:
							n3[i][j] = n[i][j-2];
							break;
						}
						
						break;
					}
					
				}
			}
			
			return n3;
		}else {
			throw new ErrorHandler("Datos proporcionados en el Array no Validos");
		}
		
	}
	
	private int validation(int[][] array) {
		
		int a = 0 ;
		
		for(int i = 0 ; i < array.length; i++) {
			
			for(int j = 0 ; j < array[i].length; j++) {
				a++;
			}}

		
		return a;
	}

}
