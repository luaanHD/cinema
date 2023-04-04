public class Principal {
    public static void main(String[] args) {
        Filme f = new Filme();

        f.setCodigo(13);
        f.setNome("Gato de Botas 2: O Último Pedido");
        f.setValor(23.50);
        
        f.setDisponivel(true);
        if(f.isDisponivel()){
            System.out.println("O código do filme é: "+ f.getCodigo());
            System.out.println("O nome do filme é: "+ f.getNome());
            System.out.println("O valor do filme é: "+ f.getValor());
            System.out.println("O filme está: "+ f.isDisponivel());
        } else{
            System.out.println("O filme não se encontra disponível");
        }
    }
}
