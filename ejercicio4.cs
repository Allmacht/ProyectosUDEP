using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio4{
	class program{
		static void Main(string[] args){
			int num1, num2, num3, num4,prom;
			string linea;
			Console.WriteLine("Ingrese el primer valor: ");
			linea=Console.ReadLine();
			num1=int.Parse(linea);
			
			Console.WriteLine("Ingrese el segundo valor: ");
			linea=Console.ReadLine();
			num2=int.Parse(linea);
			
			Console.WriteLine("Ingrese el tercer valor: ");
			linea=Console.ReadLine();
			num3=int.Parse(linea);
			
			Console.WriteLine("Ingrese el cuarto valor: ");
			linea=Console.ReadLine();
			num4=int.Parse(linea);
			
			num1=num1+num2+num3+num4;
			prom=num1/4;
			
			Console.WriteLine("la suma es: "+num1);
			Console.WriteLine("el promedio es: "+prom);
			Console.ReadKey();
		}
	}
}			
		
