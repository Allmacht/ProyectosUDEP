using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio2{
	class program{
		static void Main(string[] args){
			int lado;
			string linea;
			Console.WriteLine("ingrese el valor de lado: ");
			linea=Console.ReadLine();
			lado=int.Parse(linea);
			lado=lado*4;
			Console.WriteLine("el perimetro es: "+lado);
			Console.ReadKey();
		}
	}
}
