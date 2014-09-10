/**
* @file Agenda.java
* @brief Criação da classe agenda.
* @author João
* @author Rodrigo
*/
package model;

import java.util.ArrayList;

/**
* @class Agenda
* @brief Está classe mantém uma lista de objetos de Contatos
*/
public class Agenda
{
	private ArrayList<Contato> listaContato;

	public Agenda()
	{
		this.listaContato = new ArrayList<Contato>();
	}

	public void adicionarContato(Contato _contato)
	{
		//Validar o parametro _contato
		this.listaContato.add(_contato);
		return;
	}

	public void removerContato(String _nome)
	{
		//Verificar
		for(Contato c : listaContato){
			if(c.getNome().equals(nome)){
				this.listaContato.remove(c);
				return;
			}
		}
		return;
	}

	public ArrayList<Contato> retornarListaDeContato()
	{
		//Verificar
		return this.listaContato;
	}
}
