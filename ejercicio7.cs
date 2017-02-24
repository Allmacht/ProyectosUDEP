/* realizar programa que solicite ingresar 2 numeros distintos y muestre 
por pantalla el mayor de ellos*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio7{
	class program{
		static void Main(string[] args){
			float A,B;
			string linea;
			Console.WriteLine("Ingrese primer numero:");
			linea=Console.ReadLine();
			A=float.Parse(linea);
			
			Console.WriteLine("Ingrese segundo numero:");
			linea=Console.ReadLine();
			B=float.Parse(linea);
			
			if(A>B){ Console.Write(A);
			}
			else
			{
			Console.Write(B);
		}
		Console.ReadKey();
	}
}
}
