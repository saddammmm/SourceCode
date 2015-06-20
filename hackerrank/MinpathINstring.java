package hackerrank;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class MinpathINstring

{
    public static void main(String args[]) throws FileNotFoundException,IOException
    {   
        FileInputStream FS = new FileInputStream("F:\\CrntWrkng\\input.txt");
        DataInputStream DS = new DataInputStream(FS);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(DS));

        String strLine = buffer.readLine();             
       // int testCase = Integer.parseInt(strLine);

        int R,C;

       // for(int i = 0;i < testCase;i++)
                 

            strLine = buffer.readLine();                    
            String input[] = strLine.split(" ");

            R = Integer.parseInt(input[0]);
            C = Integer.parseInt(input[1]);

            char[][] array = new char[R][C];

            int sCoordX = 0;
            int sCoordY = 0;
            int eCoordX = 0;
            int eCoordY = 0;

            for(int j = 0; j < R ; j++)
            {
                strLine = buffer.readLine();        

                for(int k = 0;k < C;k++)
                {                               
                    array[j][k] = strLine.charAt(k);
                    if(array[j][k] == 'A')
                    {
                        sCoordX = j;
                        sCoordY = k;
                    }

                    if(array[j][k] == 'B')
                    {
                        eCoordX = j;
                        eCoordY = k;
                    }
                }   
            

            boolean reached = false;
            int counter = 0;
            int posX = sCoordX;
            int posY = sCoordY;
            while(!reached)
            {
                if(array[posX][posY] == 'B')
                {
                    reached = true;
                    System.out.println("You are in goal!");
                    System.out.println(array[posX][posY]);
                    System.out.println("Number of steps:"+counter);
                }

                if(!reached && posX > eCoordX)
                {
                        posX--;
                        counter++;                  
                }
                else if(!reached && posX < eCoordX)
                {
                    posX++;
                    counter++;                  
                }

                if(!reached && posY > eCoordY)
                {
                    posY--;
                    counter++;          
                }
                else if(!reached && posY < eCoordY)
                {
                    posY++;
                    counter++;              
                }
            }
        }   
    }
}