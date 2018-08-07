class Mostrador implements Consumer<Usuario> {
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}
}