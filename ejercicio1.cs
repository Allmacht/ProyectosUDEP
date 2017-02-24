using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio1{
	class program{
		 static void Main(string[] args){
			int num1, num2, suma, producto;
			string linea;
			Console.WriteLine("Ingrese el primer valor: ");
			linea=Console.ReadLine();
			num1=int.Parse(linea);
			Console.WriteLine("Ingrese el segundo valor: ");
			linea=Console.ReadLine();
			num2=int.Parse(linea);
			suma=num1+num2;
			producto=num1*num2;
			Console.WriteLine("la suma de los dos valores es: ");
			Console.WriteLine(suma);
			Console.WriteLine("el producto de los dos valores es: ");
			Console.WriteLine(producto);
			Console.ReadKey();
		}
	}
}
