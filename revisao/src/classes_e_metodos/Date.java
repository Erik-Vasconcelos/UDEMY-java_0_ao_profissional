package classes_e_metodos;

public class Date {
	private int dia;
	private int mes;
	private int ano;
	
	public Date() {
		this(1, 1, 1970);
	}
	
	public Date(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String displayDate() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
}
