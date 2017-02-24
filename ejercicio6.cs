using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicio6{
	class program{
		static void Main(string[] args){
			float sueldo;
			string linea;
			Console.WriteLine("Ingrese sueldo: ");
			linea=Console.ReadLine();
			sueldo=float.Parse(linea);
			if(sueldo>=3000)
				Console.WriteLine("Esta Persona debe abonar Impuestos");
			else{
			Console.ReadKey();
			}
		}
	}
}
