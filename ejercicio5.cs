using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio5{
	class program{
		static void Main(string[] args){
			int precio, cantidad;
			string linea;
			
			Console.WriteLine("Ingrese el valor del producto: ");
			linea=Console.ReadLine();
			precio=int.Parse(linea);
			
			Console.WriteLine("Ingrese la cantidad: ");
			linea=Console.ReadLine();
			cantidad=int.Parse(linea);
			
			precio=precio*cantidad;
			Console.WriteLine("el total es: "+precio);
			Console.ReadKey();
			
		}
	}
}
