
print "Write a short string followed by some text, devide it by space: ";
String userInput = System.console().readLine();

def listForLetters = [];

def listForText = [];

boolean flag = false;
for (int i =0; i < userInput.length(); i++){

	while(flag == false){
		
		if (userInput.charAt(i) != " "){
		
			listForText.add(userInput[i]); 
		
		} else {
		
			flag = true;	
		
		}
	}
	
	if (userInput.charAt(i) != " "){
		
		listForLetters.add(userInput[i]); 		
	
	}


}

println listForLetters;
println listForText;
