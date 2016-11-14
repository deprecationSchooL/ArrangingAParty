//building... have not set up to run yet.
//start time: 				july 22,  1:10pm	july 22, 12:04 am	july 21, 8:30  pm	feb  18, 6:13 pm  
//finish time for the day:  		july 22,  3:00pm  	july 22, 1:10  am	july 21, 10:30 pm	
/*      time worked: 2 hours 10 minutes
	      //plus 1 hour  36 minutes
	      //plus 2 hours
       	      //plus 0 hours 54 minutes
total time worked: 5 hours 40 minutes*/      	      
/*
There is a great celebration. There are guests - N gentlemen and N ladies. 
Now they are to be organized in pairs for the great dance. However women are 
capricious - each of them will agree to dance only with very certain partners she likes. 
So master of ceremonies is having hard time trying to make as many pairs as possible. 
Please, help him in this task!

Ladies are numbered with integers from 1 to N. Gentlemen have numbers from N+1 to 2N. 
For each lady you are given numbers of partners with whom she is ready to make a pair.

Input data: first line contains value N.
Next lines have the id of lady with a colon and then a list of id-s of gentlemen with whom she is ready to dance.
Answer should give a single value - maximum possible amount of pairs.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ArrangingAParty {
	public static void main(String[] args) 
    {
//given (N = maxFemale) + (2N = Male)
//males continue after females  (1 to N(max female) to N+1 to 2N(max Male)
//first line contains max females
//		Next lines have the id of lady with a colon and then a list of id-s of gentlemen with whom she is ready to dance.
		//19	||first input = N
		ArrayList<ArrayList<Integer>> twoDFemaleArray = new ArrayList<ArrayList<Integer>>(); 
	       /*1: 25	    //case (id == 1  || id != 2 )..set [1][new integers]
		2: 20 25 28 //case (id == 2  || id != 3 )..set [2]
		3: 27 32 37 //case (id == 3  || id != 4 )..set [3]
		4: 22       //case (id == 4  || id != 5 )..set [4]
		5: 32 38    //case (id == 5  || id != 6 )..set [5]
		6: 32 34 35 //case (id == 6  || id != 7 )..set [6]
		7: 22 34 37 //case (id == 7  || id != 8 )..set [7]
		8: 30 35 38 //case (id == 8  || id != 9 )..set [8]
		9: 20 23    //case (id == 9  || id != 10)..set [9]
		10: 24 29   //case (id == 10 || id != 11)..set [10]
		11: 29 32   //case (id == 11 || id != 12)..set [11]
		12: 23 26 31//case (id == 12 || id != 13)..set [12]
		13: 21 25 34//case (id == 13 || id != 14)..set [13]
		14: 21 27   //case (id == 14 || id != 15)..set [14]
		15: 20      //case (id == 15 || id != 16)..set [15]
		16: 23 31 38//case (id == 16 || id != 17)..set [16]
		17: 22 27 28//case (id == 17 || id != 18)..set [17]
		18: 35
		19: 24 25*/
//String[]numbers = id.split("\\s*,\\s*");//delimited with commas not used not needed the way i am imagining input.
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();//get first number which is total females
int id = sc.nextInt();
        int count = 1;		
       while (id == count)
			{id = sc.nextInt()        		
    		 while (id > count+1)
    		 	{twoDFemaleArray.get(count,id);
    		 	
    		 	id = sc.nextInt();}
			count++;}//id will be 2 and count will now be 2     
//construction of 2DArrayFemales completed for now.
//now i must count through and find frequency for male and male array       
       ArrayList<ArrayList<Integer>> twoDMaleArray = new ArrayList<ArrayList<Integer>>();
while(N+1<=N)//fill up array for men based on frequency count
	{
	twoDMaleArray.get(N).set(j,25);//still needs a bit o work.
	N++;}
//FOR(int i = 0; i<=N; i++)
//	{
//FOR(int j = 0; j<twoDFemaleArray<count>.length; j++)
// {twoDFemaleArray<count><id>}
	

       
//FOR(int i = 0; i<=N; i++)
    {
//	FOR(int j = 0; j<twoDFemaleArray<count>.length; j++)
//     {twoDFemaleArray<count><id>}
//        
    }
}
}
	//there is an alternative method 
	//build men array build female array
	//quick compare //somehow ? all web connect quick solution?
	
	
//restarted working to make simpler code	
	import java.util.Scanner;
	import java.util.ArrayList;
	public class NewArrParty 
	{			
		public static int main(String[] args)
		{//initialize male counter array
//			Scanner sc = new Scanner(System.in);
//			int N = sc.nextInt();
//			getAndBuildAllArrays();
			Rule1();								//obviously i dont want static but wanted to keep organized clean
			Rule2();//no man left alone				//obviously i dont want static but wanted to keep organized clean

		}
void twoDFemaleSubtractFromCount(){}//still need built
void twoDMaleAddOne(idMale){						//should be used by rule 1 and rule 2
	int value = twoDMaleCountArray.get(i, 0);
	int value2 = value + 1; //value += 1
	twoDMaleCountArray.get(idMale).set(0, value2);
	}
void twoDMaleSubtractOne(idMale){					//should be used by rule 1 and rule 2
	int value = twoDMaleCountArray.get(i, 0);
	int value2 = value - 1; //value -= 1
	twoDMaleCountArray.get(idMale).set(0, value2);
	}
	static void Rule1(){
		//woman preferance
		//twoDMaleSubtract()
		//twoDFemaleCount and twoDFemaleArray.. delete or is null
		//match = 0;
		//match += 1;
		//rule 1 is going to require counting through the array finding idMale passing it to method and then running method.
	}
	static void Rule2()//no man left alone
		{//count through array-MaleCount if (spot == 1){//find woman to be deleted
		//twoDMaleCount subtract the woman who is about to be deleted.
		//record of woman deleted by both twoDFemaleCount and twoDFemaleArray
		//twoDMaleCount subtract the woman who was just deleted.
		//the above will set Male count to 0 ... since it is null should i delete it?
		//rule 1 is going to require counting through the array finding idMale passing it to method and then running method.
		}
	void GetAndBuildAllArrays()
	{
		maleCountArray();
		twoDFemaleArray();//creates all of them.
	}
	public void maleCountArray(){//twoDMaleCountArray
//this one might not work i need to test to see if it actually builds.
		ArrayList<ArrayList<Integer>> twoDMaleCountArray = new ArrayList<ArrayList<Integer>>();
			for(int i = 21; i<=40; i++)
				{
					twoDMaleCountArray.get(i).set(0, 0);
				}
			 //later we can count directly 					||shown in two methods below
			 //and reference them by get (i,0)
			 //value = get(i, 0);
			 //value2 = value + 1 //value += 1
			 // twoDMaleCountArray.get(i).set(0, value2); 
		}
	int twoDFemaleArray(){//did i successfully pass id from main? probably bad programming practice  and could have been done better.
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> twoDFemaleArray = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> twoDFemaleCountArray = new ArrayList<ArrayList<Integer>>();
		int id = sc.nextInt();
		int count = 1;
		while(id == count)
			{
				int i = 0;
				int idMale = sc.nextInt();
				i++;
				int femaleCount = 0;
				while(idMale>count+1)
				{
				
					twoDFemaleArray.get(id).set(i,idMale);//this could be single array fairly easy but i dont want to change everything at moment.
					//return idMale;
					//twoDMaleAddOne(idMale);//set
					femaleCount++;
					idMale = sc.nextInt();
				}
			twoDFemaleCountArray.get(id).set(0, femaleCount);	
			count++;		//counting these at the same time
			id = idMale;	//will allow full iterization and composition of array
			}
		}
	//female is created .. also maleCount .. now i need female count
	}

