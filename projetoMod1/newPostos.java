package projetoMod1;

import java.util.ArrayList;

public class newPostos {
	public static void main (String args[]) {
		
		ArrayList<String> Postos = new ArrayList<String>();

		PostosConstructor posto1N = new PostosConstructor("1 - Drive Thru Jaçanã","ZN","R: Carlos Dos Santos  S/N",500,250);
		PostosConstructor posto2N = new PostosConstructor("2 - Drive Thru Tremembé","ZN","R: Dos Passaros Jd Labitary",250,100);
		PostosConstructor posto3N = new PostosConstructor("3 - Drive Thru Vila Maria","ZN","Rua Antonio M.De Camargo Soldado,87",150,20);
		PostosConstructor posto1S = new PostosConstructor("4 - Drive Thru Cambuci","ZS","Avenida Lacerda Franco, 795",200,50);
		PostosConstructor posto1L = new PostosConstructor("5 - Drive Thru Cidade Tiradentes","ZL","Rua Cabocla Da Lua Nova",150,20);
		PostosConstructor posto2L = new PostosConstructor("6 - Drive Thru Itaim Paulista","ZL","Rua Cabocla Da Lua Nova",700,150);
		PostosConstructor posto3L = new PostosConstructor("7 - Drive Thru São Mateus","ZL","Rua: Angelo De Candia,1058",0,50);
		PostosConstructor posto1O = new PostosConstructor("8 - Mega Drive Clube Hebraica","ZO","Rua Ibiapinóplis, 781",700,200);
		
	}

}
